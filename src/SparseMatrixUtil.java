import java.math.BigDecimal;


public class SparseMatrixUtil {
	public static SparseMatrix genratorEmptysparseMatrix(){
		return new SparseMatrix();
	}
	/**
	 * ����������������ƶ�
	 * @param matrixA
	 * @param martrixB
	 * @return
	 */
	public static BigDecimal cacluSimilarity(SparseMatrix matrixA, SparseMatrix martrixB){
		BigDecimal result = null;
		System.out.println("mei shixian ne!");
		return result;
	}
	/**
	 * ����ƽ��
	 * @param matrix ԭʼ����
	 * @param offsetX xƫ��
	 * @param offsetY yƫ��
	 * @return ƽ�ƺ���¾���
	 */
	public static SparseMatrix translationMatrix(SparseMatrix matrix, int offsetX, int offsetY){
		SparseMatrix reslutMatrix = SparseMatrixUtil.genratorEmptysparseMatrix();
		for (SparseElement ele : matrix.getSparseMatrixContent()){
			reslutMatrix.setElement(ele.getRow() + offsetX, ele.getColumn() + offsetY, 1);
		}
		return reslutMatrix;
	}
	/**
	 * ������ת
	 * @param matrix ԭʼ����
	 * @param rotation ��ת�Ƕȣ���λ�ȣ�
	 * @return ��ת��ľ���
	 */
	public static SparseMatrix spinMatrix(SparseMatrix matrix, Double rotation){
		SparseMatrix reslutMatrix = SparseMatrixUtil.genratorEmptysparseMatrix();
		for (SparseElement ele : matrix.getSparseMatrixContent()){
			double c = ele.getColumn() * Math.cos(rotation) - ele.getRow() * Math.sin(rotation);
			double d = ele.getRow() * Math.cos(rotation) + ele.getColumn() * Math.sin(rotation);
			reslutMatrix.setElement(new Double(c).intValue(), new Double(d).intValue(), 1);
		}
		return reslutMatrix;
	}
	/**
	 * �����޼�
	 * @param matrix ԭʼ����
	 * @return �޳��Ŀհױ�Ե�ľ���
	 */
	public static SparseMatrix trimMatrix(SparseMatrix matrix){
		SparseMatrix reslutMatrix = SparseMatrixUtil.genratorEmptysparseMatrix();
		int rowNum = matrix.getRowNum();
		int columnNum = matrix.getColumnNum();
		for (int i = 0; i < rowNum; i++){//�����Ϸ��հ�
			if (matrix.getRow(i).size() == 0){
				matrix.removeRow(i);
				continue;
			}else{
				matrix.removeRow(i);
				break;
			}
		}
		for (int i = rowNum; i >= 0; i--){//�����·��հ�
			if (matrix.getRow(i).size() == 0){
				matrix.removeRow(i);
				continue;
			}else{
				matrix.removeRow(i);
				break;
			}
		}
		for (int i = 0; i < columnNum; i++){//�����󷽿հ�
			if (matrix.getColumn(i).size() == 0){
				matrix.removeColumn(i);
				continue;
			}else{
				matrix.removeColumn(i);
				break;
			}
		}
		for (int i = columnNum; i >= 0; i--){//�����ҷ��հ�
			if (matrix.getColumn(i).size() == 0){
				matrix.removeColumn(i);
				continue;
			}else{
				matrix.removeColumn(i);
				break;
			}
		}
		return reslutMatrix;
	}
	/**
	 * ��������
	 * @param matrix ԭʼ����
	 * @param scaling ���ű���
	 * @return ���ź�ľ���
	 */
	public static SparseMatrix scaleMatrix(SparseMatrix matrix, double scaling){
		SparseMatrix reslutMatrix = SparseMatrixUtil.genratorEmptysparseMatrix();
		for (SparseElement ele : matrix.getSparseMatrixContent()){
			double c = ele.getRow() * scaling;
			double d = ele.getColumn() * scaling;
			reslutMatrix.setElement(new Double(c).intValue(), new Double(d).intValue(), 1);
		}
		return reslutMatrix;
	}
}
