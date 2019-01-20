package decodecrn;

import javax.swing.JOptionPane;

/**
 * @Author: Niranjan Bekoju
 * @Address: Liwali Bhaktapur
 * @College: Khwopa College of Engineering
 */
public class DecodeCRN {

    public static void main(String[] args) {
        String crn = JOptionPane.showInputDialog("Enter YOur ROll Number");
        try {
            int length = crn.length();
            if (length == 12) {
                JOptionPane.showMessageDialog(null, "Batch: " + crn.substring(3, 6) + "\nDept: " + crn.substring(6, 9) + "\nRoll: " + crn.substring(9, 12), "YOur College Information", 1);
            } else {
                throw new Exception("Roll no should of format 'KCE074BCT025'");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Message:\n" + e.getMessage(), "ERROR", 0);
        }
    }
}
