import java.lang.reflect.Method;
import java.util.List;


/**
 * 矩阵接口
 * @author zpd
 *
 */
public interface Matrix {
	/**
	 * 矩阵转置
	 */
	public void transposition();
	/**
	 * 控制台输出
	 */
	public void trace();
	/**
	 * 获取一列
	 * @param index 列数
	 * @return 这一列的内容列表
	 */
	public List<SparseElement> getColumn(int index);
	/**
	 * 移除一列
	 * @param index 移除列数
	 */
	public void removeColumn(int index);
	/**
	 * 获取一行
	 * @param index 行数
	 * @return 这一行的内容列表
	 */
	public List<SparseElement> getRow(int index);
	/**
	 * 移除一行
	 * @param index 移除行数
	 */
	public void removeRow(int index);
	/**
	 * 矩阵指定位置元素赋值
	 * @param rowIndex 行数
	 * @param columnIndex 列数
	 * @param value 元素值
	 */
	public void setElement(int rowIndex, int columnIndex, int value);
	/**
	 * 获取矩阵指定元素值
	 * @param rowIndex 行数
	 * @param columnIndex 列数
	 * @return 元素值
	 */
	public int getElement(int rowIndex, int columnIndex);
	/**
	 * @return 总行数
	 */
	public int getRowNum();
	/**
	 * @return 总列数
	 */
	public int getColumnNum();
}
