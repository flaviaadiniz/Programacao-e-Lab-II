package src.main.java.semanas9e10.listas;

import java.util.Arrays;

public class StaticList<E> implements List<E> {

    protected E[] elements;
    int numElements;

    public StaticList(int maxSize) {
        elements = (E[]) new Object[maxSize];
        numElements = 0;
    }

    @Override
    public int numElements() {
        return numElements;
    }

    @Override
    public boolean isEmpty() {
        return numElements == 0;
    }

    @Override
    public boolean isFull() {
        return numElements == elements.length;
    }

    @Override
    public void insert(E element, int position) throws OverflowException, IndexOutOfBoundsException {

        // verifica se há espaço na lista
        if (isFull()) {
            throw new OverflowException();
        }

        // verifica se a posição é válida
        if (position < 0 || position > numElements) {
            throw new IndexOutOfBoundsException();
        }

        // desloca para a direita os elementos necessários, abrindo espaço para o novo
        for (int i = numElements - 1; i >= position; i--) {
            elements[i+1] = elements[i];
        }

        // armazena o novo elemento e ajusta o total
        elements[position] = element;
        numElements++;

    }

    @Override
    public E remove(int position) throws UnderflowException, IndexOutOfBoundsException {

        // verifica se a lista está vazia
        if (isEmpty()) {
            throw new UnderflowException();
        }

        // guarda uma referência temporária ao elemento removido
        E element = elements[position];

        // desloca para a esquerda os elementos necessários, sobrescrevendo a posição do que está sendo removido
        for (int i = position; i < numElements - 1; i++) {
            elements[i] = elements[i+1];
        }

        // define para null a posição antes ocupada pelo último, para que a coleta de lixo possa atuar e ajusta o total
        elements[numElements - 1] = null;
        numElements--;

        return element;

    }

    @Override
    public E get(int position) throws IndexOutOfBoundsException {

        // verifica se a posição é válida
        if (position < 0 || position >= numElements) {
            throw new IndexOutOfBoundsException();
        }
        return elements[position];

    }

    @Override
    public int search(E element) {
        for (int i = 0; i < numElements; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }

        // se chegar até aqui, é porque não encontrou o elemento
        return -1;
    }

    @Override
    public String toString() {
        return "StaticList {" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }



    // -------------- exercícios de programação e laboratório -------------- //

    /*
    Na classe que representa uma lista estática (classe criada em aula), implemente um método RECURSIVO que recebe um
    elemento por parâmetro e retorna a quantidade de vezes que este elemento aparece na lista. Você deve fazer os métodos
    público e privado. Você deve utilizar a seguinte assinatura do método público:
    public int contaElementos(E el) throws IllegalArgumentException
    */

    @Override
    public int contaElementos(E elemento) throws IllegalArgumentException {
        if (elemento == null) {
            throw new IllegalArgumentException("Elemento não pode ser nulo!");
        }

        return contaElementosPrivado(elemento, numElements, 0);
    }

    private int contaElementosPrivado(E elemento, int numElements, int contador) {
        if (numElements == 0) {
            return contador;
        }

        if (elements[numElements - 1] == elemento) {
            contador++;
        }

        numElements--;

        return contaElementosPrivado(elemento, numElements, contador);
    }



    /*
    Implemente um método, em uma classe qualquer, que receba como parâmetro uma lista sequencial de números inteiros
    (objetos do tipo Integer) e retorne um vetor contendo apenas os números pares desta lista. Para isso utilize a
    seguinte assinatura: public Integer[] evenNumbers(List<Integer> lista).
    */

    @Override
    public Integer[] evenNumbers(List<Integer> lista) {
        int newArraySize = 0;

        for (int i = 0; i < lista.numElements(); i++) {
            if (lista.get(i) % 2 == 0) {
                newArraySize++;
            }
        }

        Integer[] newArray = new Integer[newArraySize];
        int position = 0;

        for (int i = 0; i < lista.numElements(); i++) {
            if (lista.get(i) % 2 == 0) {
                newArray[position] = lista.get(i);
                position++;
            }
        }

        return newArray;
    }



    /*
    Implemente um método que recebe duas listas e retorna uma terceira, contendo a intercalação dos elementos das duas
    listas. Por exemplo, dadas as listas t1 = (A, B, C) e t2 = (D, E, F), a intercalação das duas deve produzir
    (A, D, B, E, C, F). As listas originais não devem ser alteradas.
    Assinatura do método: public List<Character> mergeLists(List<Character> t1,List<Character>t2)
    */

    @Override
    public List<Character> mergeLists(List<Character> t1,List<Character> t2) throws OverflowException,
            IndexOutOfBoundsException {

        List<Character> newList = new StaticList<>(t1.numElements() + t2.numElements());

        int cont1 = 0;
        int cont2 = 0;

        do {
            if (cont1 < t1.numElements()) {
                newList.insert(t1.get(cont1++), newList.numElements());
            }

            if (cont2 < t2.numElements()) {
                newList.insert(t2.get(cont2++), newList.numElements());
            }

        } while (cont1 < t1.numElements() || cont2 < t2.numElements());

        return newList;

    }



    /*
    Implemente um método que recebe duas listast1et2e copia os elementos da segunda para o início da primeira.
    Assinatura do método: public void prependList(List<Double> t1, List<Double>t2)
    */




}
