package ClassPkg;

import java.util.Arrays;

import InterfacePkg.List;

public class ArrayList<E> implements List<E> {
	
	private static final int DEFAULT_CAPACITY = 10; //최소(기본) 용적 크기 != size
	private static final Object[] EMPTY_ARRAY = {}; // 빈 배열
	
	private int size; // 요소 갯수
	
	Object[] array; // 요소 담을 배열
	
	//생성자1 (초기 공간 할당X)
	public ArrayList() {
		this.array = EMPTY_ARRAY;
		this.size = 0;
	}
	
	//생성자2(초기 공간 할당O)
	public ArrayList(int capacity) {
		this.array = new Object[capacity];
		this.size = 0;
	}
	
	private void resize() {
		int array_capacity = array.length;
		
		// 용적이 0일 경우
		if(Arrays.equals(array, EMPTY_ARRAY)) {
			array = new Object[DEFAULT_CAPACITY];
			return;
		}
		
		// 용량이 꽉 찰 경우
		if(size == array_capacity) {
			int new_capacity = array_capacity * 2;
			
			//
			array = Arrays.copyOf(array, new_capacity);
			return;
		}
		
		// 용적의 절반 미만으로 요소 차지할 경우
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
		
		// 용적 꽉차있으면 용적 재할당
		if(size == array.length) {
			resize();
		}
		array[size] = value; // 마지막 위치에 요소 추가
		size++; // 사이즈 1 증가시켜줘야 다음에 addLast 쉽겠쥬 왜? size가 요소 개수니까
	}
	
	@Override
	public void add(int index, E value) {
		
		if(index > size || index < 0) { //영역을 벗어날 경우 예외 발생
			throw new IndexOutOfBoundsException();
		}
		if(index == size) { // index가 마지막 위치면 그대로 addLast 메소드로 요소 추가
			addLast(value);
		}else {
			
			if(size == array.length) { //꽉 차있으면 용적 재할당
				resize();
			}
			
			//index 기준 후자에 있는 모든 요소들 한 칸씩 뒤로 밀리
			for(int i=size; i>index; i--) {
				array[i] = array[i-1];
			}
			
			array[index] = value; // index 위치에 요소 할당
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
		
		// value 와 같은 객체(요소 값)일 경우 i(위치) 반환
		for(i=0; i<size; i++) {
			if(array[i].equals(value)) {
				return i;
			}
		}
		
		//일치하는 경우 없을경우 -1 반환
		return -1;
	}

	public int lastIndexOf(Object value) {
		for(int i=size-1; i>=0; i--) {
			if(array[i].equals(value)) {
				return i;
			}
		}
		
		//일치하는 경우 없을경우 -1 반환
		return -1;
	}
	
	@Override
	public boolean contains(Object value) {
		//0이상이면 요소 존재
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
		
		E element = (E) array[index]; // 삭제될 요소 반환하기 위해 임시로 담기
		array[index] = null;
		
		// 삭제한 요소 뒤에 있는 모든 요소들 한 칸씩 당겨옴
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
		
		// 삭제하려는 요소의 인덱스 찾기
		int index = indexOf(value);
		
		// -1이면 array에 요소가 없음 의미이므로 false 반환
		if(index == -1) return false;
		
		// index 위치에 있는 요소 삭제
		remove(index);
		return true;
	}
	
	@Override
	public int size() {
		return size; //요소 갯수 반환
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public void clear() {
		// 모든 공간을 null 처리
		for(int i=0; i<size; i++) {
			array[i] = null;
		}
		
		size=0;
		resize(); //용적도 최솟값으로 해주지 않는 이유는 다음 데이터도 같은 데이터 사이즈일 가능성 높음.
				  //따라서 절반으로 줄여줌. 또한 데이터 쓰지 않더라도 삭제 과정에서 용적량 줄이므로 문제X
	}
	
}
