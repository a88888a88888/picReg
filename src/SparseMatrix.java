import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import sun.rmi.runtime.Log;
import sun.util.logging.resources.logging;

/**
 * ϡ�����
 * @author zpd
 *
 */
public class SparseMatrix implements Matrix{

	/**
	 * ��������(��Ԫ��)
	 */
	private List<SparseElement> _content = new ArrayList<SparseElement>();
	/**
	 * ����
	 */
	private int columnNum = 0;
	/**
	 * ����
	 */
	private int rowNum = 0;
	/**
	 * ����һ����ά����Ϊ������ϡ�����
	 * @param param
	 */
	SparseMatrix(int[][] param){
		for (int i = 0; i < param.length; i++){
			SparseElement ele = new SparseElement(param[i][0], param[i][1], param[i][2]);
			_content.add(ele);
		}
	}
	/**
	 * ����һ���޲εĿ�ϡ�����
	 */
	public SparseMatrix() {
	}
	@Override
	public void transposition() {
		 for (int i = 0 ; i < _content.size(); i++){
			 SparseElement element = _content.get(i);
			 int x = element.getRow();
			 int y = element.getColumn();
			 element.setColumn(y);
			 element.setRow(x);
		 }
	}
	@Override
	public void trace() {
		for (int i = 0; i < _content.size(); i++){
			SparseElement ele = _content.get(i);
			ele.trace();
			System.out.println("");
		}
	}
	@Override
	public List<SparseElement> getColumn(int index) {
		List<SparseElement> list = new ArrayList<SparseElement>();
		for (SparseElement ele : this._content){
			if (ele.getColumn() == index){
				list.add(ele);
			}
		}
		return list;
	}
	@Override
	public List<SparseElement> getRow(int index) {
		List<SparseElement> list = new ArrayList<SparseElement>();
		for (SparseElement ele : this._content){
			if (ele.getRow() == index){
				list.add(ele);
			}
		}
		return list;
	}
	@Override
	public void setElement(int rowIndex, int columnIndex, int value) {
		this.rowNum = Math.max(rowIndex, rowNum);
		this.columnNum = Math.max(columnIndex, columnNum);
		for (SparseElement ele : _content){
			if (rowIndex == ele.getRow() && columnIndex == ele.getEleValue()){
				ele.setEleValue(value);
				return;
			}
		}
		SparseElement addEle = new SparseElement(rowIndex, columnIndex, value);
		_content.add(addEle);
	}
	@Override
	public int getElement(int rowIndex, int columnIndex) {
		for (SparseElement ele : _content){
			if (rowIndex == ele.getRow() && columnIndex == ele.getEleValue()){
				return ele.getEleValue();
			}
		}
		return 0;
	}
	/**
	 * @return ϡ����� ��Ԫ������
	 */
	public List<SparseElement> getSparseMatrixContent(){
		return this._content;
	}
	@Override
	public int getRowNum() {
		return this.rowNum;
	}
	@Override
	public int getColumnNum() {
		return this.columnNum;
	}
	@Override
	public void removeColumn(int index) {
		for (SparseElement ele : this._content){
			if (ele.getColumn() > index){
				ele.setColumn(ele.getColumn() - 1);
			}
		}
	}
	@Override
	public void removeRow(int index) {
		for (SparseElement ele : this._content){
			if (ele.getRow() > index){
				ele.setRow(ele.getRow() - 1);
			}
		}
	}
}