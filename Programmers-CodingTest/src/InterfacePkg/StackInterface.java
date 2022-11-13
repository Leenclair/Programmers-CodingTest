package InterfacePkg;

public interface StackInterface<E> {
	
	/**
	 * ������ �� ���� ��� �߰�
	 * @param item ���ÿ� �߰��� ���
	 * @return ���ÿ� �߰��� ���
	 */
	E push(E item);
	
	/**
	 * ������ �� ���� �ִ� ��� ����, ���ŵ� ��� ��ȯ
	 * @return ���ŵ� ���
	 */
	E pop();
	
	/**
	 * ������ �� ���� �ִ� ��� �������� �ʰ� ��ȯ
	 * @return ������ �� ���� �ִ� ���
	 */
	E peek();
	
	/**
	 * idx 3 "a"
	 * idx 2 "e"
	 * idx 1 "w"
	 * idx 0 "k"
	 * 
	 * search("w")�ϸ� ���(idx 3)���κ��� 3��°�� ��ġ => return �Ǵ� �� : 3
	 * 
	 * @param value
	 * @return
	 */
	int search(Object value);
	
	/**
	 * ������ ��� ���� ��ȯ
	 * @return ���ÿ� �ִ� ��� ���� ��ȯ
	 */
	int size();
	
	/**
	 * ���ÿ� �ִ� ��� ��� ����
	 */
	void clear();
	
	/**
	 * ���ÿ� ��Ұ� ����ִ��� ��ȯ
	 * @return ���ÿ� ��� ���� ��� {@code true}, �� ���� ��� {@code false} ��ȯ
	 */
	boolean empty();
}
