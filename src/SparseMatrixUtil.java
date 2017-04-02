import java.math.BigDecimal;


public class SparseMatrixUtil {
	public static SparseMatrix genratorEmptysparseMatrix(){
		return new SparseMatrix();
	}
	/**
	 * 计算两个矩阵的相似度
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
	 * 矩阵平移
	 * @param matrix 原始矩阵
	 * @param offsetX x偏移
	 * @param offsetY y偏移
	 * @return 平移后的新矩阵
	 */
	public static SparseMatrix translationMatrix(SparseMatrix matrix, int offsetX, int offsetY){
		SparseMatrix reslutMatrix = SparseMatrixUtil.genratorEmptysparseMatrix();
		for (SparseElement ele : matrix.getSparseMatrixContent()){
			reslutMatrix.setElement(ele.getRow() + offsetX, ele.getColumn() + offsetY, 1);
		}
		return reslutMatrix;
	}
	/**
	 * 矩阵旋转
	 * @param matrix 原始矩阵
	 * @param rotation 旋转角度（单位度）
	 * @return 旋转后的矩阵
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
	 * 矩阵修剪
	 * @param matrix 原始矩阵
	 * @return 剔除的空白边缘的矩阵
	 */
	public static SparseMatrix trimMatrix(SparseMatrix matrix){
		SparseMatrix reslutMatrix = SparseMatrixUtil.genratorEmptysparseMatrix();
		int rowNum = matrix.getRowNum();
		int columnNum = matrix.getColumnNum();
		for (int i = 0; i < rowNum; i++){//清理上方空白
			if (matrix.getRow(i).size() == 0){
				matrix.removeRow(i);
				continue;
			}else{
				matrix.removeRow(i);
				break;
			}
		}
		for (int i = rowNum; i >= 0; i--){//清理下方空白
			if (matrix.getRow(i).size() == 0){
				matrix.removeRow(i);
				continue;
			}else{
				matrix.removeRow(i);
				break;
			}
		}
		for (int i = 0; i < columnNum; i++){//清理左方空白
			if (matrix.getColumn(i).size() == 0){
				matrix.removeColumn(i);
				continue;
			}else{
				matrix.removeColumn(i);
				break;
			}
		}
		for (int i = columnNum; i >= 0; i--){//清理右方空白
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
	 * 矩阵缩放
	 * @param matrix 原始矩阵
	 * @param scaling 缩放比例
	 * @return 缩放后的矩阵
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
