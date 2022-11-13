package InterfacePkg;

public interface StackInterface<E> {
	
	/**
	 * 스택의 맨 위에 요소 추가
	 * @param item 스택에 추가할 요소
	 * @return 스택에 추가된 요소
	 */
	E push(E item);
	
	/**
	 * 스택의 맨 위에 있는 요소 제거, 제거된 요소 반환
	 * @return 제거된 요소
	 */
	E pop();
	
	/**
	 * 스택의 맨 위에 있는 요소 제거하지 않고 반환
	 * @return 스택의 맨 위에 있는 요소
	 */
	E peek();
	
	/**
	 * idx 3 "a"
	 * idx 2 "e"
	 * idx 1 "w"
	 * idx 0 "k"
	 * 
	 * search("w")하면 상단(idx 3)으로부터 3번째에 위치 => return 되는 값 : 3
	 * 
	 * @param value
	 * @return
	 */
	int search(Object value);
	
	/**
	 * 스택의 요소 개수 반환
	 * @return 스택에 있는 요소 갯수 반환
	 */
	int size();
	
	/**
	 * 스택에 있는 모든 요소 삭제
	 */
	void clear();
	
	/**
	 * 스택에 요소가 비어있는지 반환
	 * @return 스택에 요소 없을 경우 {@code true}, 그 외의 경우 {@code false} 반환
	 */
	boolean empty();
}
