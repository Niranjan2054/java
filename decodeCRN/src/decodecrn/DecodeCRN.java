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
        JOptionPane.showMessageDialog(null, "Batch: " + crn.substring(3, 6) + "\nDept: " + crn.substring(6, 9) + "\nRoll: " + crn.substring(9, 12), "YOur College Information", 1);
    }
}
