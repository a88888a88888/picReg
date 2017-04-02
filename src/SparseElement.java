/**
 * 稀疏矩阵元素
 * @author zpd
 *
 */
class SparseElement{
	/**
	 * 所在列
	 */
	private int column;
	/**
	 * 所在行
	 */
	private int row;
	/**
	 * 元素值
	 */
	private int eleValue;
	/**
	 * 构造稀疏矩阵元素
	 * @param row
	 * @param column
	 * @param value
	 */
	SparseElement(int row, int column, int value){
		this.setRow(row);
		this.setColumn(column);
		this.setEleValue(value);
	}
	/**
	 * 控制台输出该元素
	 */
	public void trace(){
		System.out.printf(this.getRow() + "-" + this.getColumn() + " : " + this.eleValue);
	}
	public int getEleValue() {
		return eleValue;
	}
	public void setEleValue(int eleValue) {
		this.eleValue = eleValue;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
}