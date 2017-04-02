import java.lang.reflect.Method;
import java.util.List;


/**
 * ����ӿ�
 * @author zpd
 *
 */
public interface Matrix {
	/**
	 * ����ת��
	 */
	public void transposition();
	/**
	 * ����̨���
	 */
	public void trace();
	/**
	 * ��ȡһ��
	 * @param index ����
	 * @return ��һ�е������б�
	 */
	public List<SparseElement> getColumn(int index);
	/**
	 * �Ƴ�һ��
	 * @param index �Ƴ�����
	 */
	public void removeColumn(int index);
	/**
	 * ��ȡһ��
	 * @param index ����
	 * @return ��һ�е������б�
	 */
	public List<SparseElement> getRow(int index);
	/**
	 * �Ƴ�һ��
	 * @param index �Ƴ�����
	 */
	public void removeRow(int index);
	/**
	 * ����ָ��λ��Ԫ�ظ�ֵ
	 * @param rowIndex ����
	 * @param columnIndex ����
	 * @param value Ԫ��ֵ
	 */
	public void setElement(int rowIndex, int columnIndex, int value);
	/**
	 * ��ȡ����ָ��Ԫ��ֵ
	 * @param rowIndex ����
	 * @param columnIndex ����
	 * @return Ԫ��ֵ
	 */
	public int getElement(int rowIndex, int columnIndex);
	/**
	 * @return ������
	 */
	public int getRowNum();
	/**
	 * @return ������
	 */
	public int getColumnNum();
}
