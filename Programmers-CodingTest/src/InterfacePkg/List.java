package InterfacePkg;

public interface List<E> {

	/**
	 * ����Ʈ�� ��� �߰�
	 * @param value ����Ʈ�� �߰��� ���
	 * @return ����Ʈ�� �ߺ� ���x ���
	 * 		   ����Ʈ�� �̹� �ߺ��Ǵ� ��� ���� ��� {@code false} ��ȯ
	 * 		   �ߺ��Ǵ� ���Ұ� ���� ��� {@code true} ��ȯ
	 */
	boolean add(E value);
	
	/**
	 * ����Ʈ�� ��Ҹ� Ư�� ��ġ�� �߰�
	 * Ư�� ��ġ �� ������ ��ҵ��� �� ĭ�� �ڷ� �и�
	 * 
	 * @param index ����Ʈ�� ��� �߰��� Ư�� ��ġ ����
	 * @param value ����Ʈ�� �߰��� ���
	 */
	void add(int index, E value);
	
	/**
	 * ����Ʈ�� index ��ġ�� �ִ� ��� ����
	 * @param index ����Ʈ���� ������ ��ġ ����
	 * @return ������ ��Ҹ� ��ȯ
	 */
	E remove(int index);
	
	/**
	 * ����Ʈ���� Ư�� ��� ����
	 * ������ ��Ұ� ���� ���� ��� ���� ó�� �߰��� ��Ҹ� ����
	 * 
	 * @param value ����Ʈ���� ������ ���
	 * @return ����Ʈ�� ������ ��� ���ų� ���� ������ ��� {@code false} ��ȯ
	 * 		   ������ ������ ��� {@code true} ��ȯ
	 */
	boolean remove(Object value);
	
	/**
	 * ����Ʈ�� �ִ� Ư�� ��ġ�� ��Ҹ� ��ȯ
	 * @param index ����Ʈ�� ������ ��ġ ����
	 * @return ����Ʈ�� index ��ġ�� �ִ� ��� ��ȯ
	 */
	E get(int index);
	
	/**
	 * ����Ʈ���� Ư�� ��ġ�� �ִ� ��Ҹ� �� ��ҷ� ��ü
	 * @param index ����Ʈ�� ������ ��ġ ����
	 * @param value ���� ��ü�� ��� ����
	 */
	void set(int index, E value);
	
	/**
	 * ����Ʈ�� Ư�� ��Ұ� ����Ʈ�� �ִ��� ���θ� Ȯ��
	 * @param value ����Ʈ���� ã�� Ư�� ��� ����
	 * @return ����Ʈ�� Ư�� ��� ������ ��� {@code true} ��ȯ
	 * 		   �������� ���� ��� {@code false} ��ȯ
	 */
	boolean contains(Object value);
	
	/**
	 * ����Ʈ�� Ư�� ��Ұ� �� ��° ��ġ�� �ִ��� ��ȯ
	 * @param value ����Ʈ���� ��ġ�� ã�� ��� ����
	 * @return ����Ʈ���� ó������ ��ҿ� ��ġ�ϴ� ��ġ�� ��ȯ
	 * 		   ��ġ�ϴ� ��Ұ� ������� -1 ��ȯ
	 */
	int indexOf(Object value);
	
	/**
	 * ����Ʈ�� �ִ� ����� ���� ��ȯ
	 * @return ����Ʈ�� �ִ� ��� ���� ��ȯ
	 */
	int size();
	
	/**
	 * ����Ʈ�� ��Ұ� ����ִ��� ��ȯ
	 * @return ����Ʈ�� ��Ұ� ���� ��� {@code true}, ���� ��� {@code false} ��ȯ
	 */
	boolean isEmpty();
	
	/**
	 * ����Ʈ�� �ִ� ��� ��� ����
	 */
	public void clear();
}
