package ClassPkg;

import java.util.Arrays;

import InterfacePkg.List;

public class ArrayList<E> implements List<E> {
	
	private static final int DEFAULT_CAPACITY = 10; //�ּ�(�⺻) ���� ũ�� != size
	private static final Object[] EMPTY_ARRAY = {}; // �� �迭
	
	private int size; // ��� ����
	
	Object[] array; // ��� ���� �迭
	
	//������1 (�ʱ� ���� �Ҵ�X)
	public ArrayList() {
		this.array = EMPTY_ARRAY;
		this.size = 0;
	}
	
	//������2(�ʱ� ���� �Ҵ�O)
	public ArrayList(int capacity) {
		this.array = new Object[capacity];
		this.size = 0;
	}
	
	private void resize() {
		int array_capacity = array.length;
		
		// ������ 0�� ���
		if(Arrays.equals(array, EMPTY_ARRAY)) {
			array = new Object[DEFAULT_CAPACITY];
			return;
		}
		
		// �뷮�� �� �� ���
		if(size == array_capacity) {
			int new_capacity = array_capacity * 2;
			
			//
			array = Arrays.copyOf(array, new_capacity);
			return;
		}
		
		// ������ ���� �̸����� ��� ������ ���
		if(size < (array_capacity / 2)) {
			int new_capacity = array_capacity / 2;
			
			//
			array = Arrays.copyOf(array, Math.max(new_capacity, DEFAULT_CAPACITY));
			return;
		}
	}

	@Override
	public boolean add(E value) {
		addLast(value);
		return false;
	}
	
	public void addLast(E value) {
		
		// ���� ���������� ���� ���Ҵ�
		if(size == array.length) {
			resize();
		}
		array[size] = value; // ������ ��ġ�� ��� �߰�
		size++; // ������ 1 ����������� ������ addLast ������ ��? size�� ��� �����ϱ�
	}
	
	@Override
	public void add(int index, E value) {
		
		if(index > size || index < 0) { //������ ��� ��� ���� �߻�
			throw new IndexOutOfBoundsException();
		}
		if(index == size) { // index�� ������ ��ġ�� �״�� addLast �޼ҵ�� ��� �߰�
			addLast(value);
		}else {
			
			if(size == array.length) { //�� �������� ���� ���Ҵ�
				resize();
			}
			
			//index ���� ���ڿ� �ִ� ��� ��ҵ� �� ĭ�� �ڷ� �и�
			for(int i=size; i>index; i--) {
				array[i] = array[i-1];
			}
			
			array[index] = value; // index ��ġ�� ��� �Ҵ�
			size++;
		}
	}
	
	public void addFirst(E value) {
		add(0, value);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		return (E) array[index];
	}
	
	@Override
	public void set(int index, E value) {
		if(index >= size || index<0) {
			throw new IndexOutOfBoundsException();
		}else {
			array[index] = value;
		}
	}
	
	@Override
	public int indexOf(Object value) {
		int i = 0;
		
		// value �� ���� ��ü(��� ��)�� ��� i(��ġ) ��ȯ
		for(i=0; i<size; i++) {
			if(array[i].equals(value)) {
				return i;
			}
		}
		
		//��ġ�ϴ� ��� ������� -1 ��ȯ
		return -1;
	}

	public int lastIndexOf(Object value) {
		for(int i=size-1; i>=0; i--) {
			if(array[i].equals(value)) {
				return i;
			}
		}
		
		//��ġ�ϴ� ��� ������� -1 ��ȯ
		return -1;
	}
	
	@Override
	public boolean contains(Object value) {
		//0�̻��̸� ��� ����
		if(indexOf(value) >= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public E remove(int index) {
		
		if(index >= size || index <0) {
			throw new IndexOutOfBoundsException();
		}
		
		E element = (E) array[index]; // ������ ��� ��ȯ�ϱ� ���� �ӽ÷� ���
		array[index] = null;
		
		// ������ ��� �ڿ� �ִ� ��� ��ҵ� �� ĭ�� ��ܿ�
		for(int i=index; i<size-1; i++) {
			array[i] = array[i+1];
			array[i + 1] = null;
		}
		size--;
		resize();
		return element;
	}
	
	@Override
	public boolean remove(Object value) {
		
		// �����Ϸ��� ����� �ε��� ã��
		int index = indexOf(value);
		
		// -1�̸� array�� ��Ұ� ���� �ǹ��̹Ƿ� false ��ȯ
		if(index == -1) return false;
		
		// index ��ġ�� �ִ� ��� ����
		remove(index);
		return true;
	}
	
	@Override
	public int size() {
		return size; //��� ���� ��ȯ
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public void clear() {
		// ��� ������ null ó��
		for(int i=0; i<size; i++) {
			array[i] = null;
		}
		
		size=0;
		resize(); //������ �ּڰ����� ������ �ʴ� ������ ���� �����͵� ���� ������ �������� ���ɼ� ����.
				  //���� �������� �ٿ���. ���� ������ ���� �ʴ��� ���� �������� ������ ���̹Ƿ� ����X
	}
	
}
