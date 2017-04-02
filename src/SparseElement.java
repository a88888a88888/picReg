/**
 * ϡ�����Ԫ��
 * @author zpd
 *
 */
class SparseElement{
	/**
	 * ������
	 */
	private int column;
	/**
	 * ������
	 */
	private int row;
	/**
	 * Ԫ��ֵ
	 */
	private int eleValue;
	/**
	 * ����ϡ�����Ԫ��
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
	 * ����̨�����Ԫ��
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