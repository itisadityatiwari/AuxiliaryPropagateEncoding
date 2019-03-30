import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;

public class Results {
	public static void main(String[] args) {

		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;

		String sname1 = null;
		String sname2 = null;
		String sname3 = null;
		String sname4 = null;
		String sname5 = null;

		

		try {
			Dbcon db = new Dbcon();
			Connection con = db.getConnection();
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM register");

			while (rs.next() == true) {

				String a = rs.getString(6);

				if (a.equalsIgnoreCase("Group1")) {

					sname1 = "Group1";
					count++;
				}
				if (a.equalsIgnoreCase("Group2")) {

					sname2 = "Group2";
					count1++;
				}
				if (a.equalsIgnoreCase("Group3")) {
					sname3 = "Group3";
					count2++;
				}
				
			}

			DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
			dataSet.setValue(count, "Total Members(G1)", sname1);
			dataSet.setValue(count1, "Total Members(G2)", sname2);
			dataSet.setValue(count2, "Total Members(G3)", sname3);
			

			JFreeChart chart = ChartFactory.createBarChart3D("Auxiliary Propagate Encoding with Efficient Encryption and Short Ciphertexts",
							"Available Group Members Details", "Total Group Members",
							dataSet, PlotOrientation.VERTICAL, true, true, true);
			ChartFrame chartFrame = new ChartFrame("Group Key Agreement with Local Connectivity",
					chart);
			chartFrame.setVisible(true);
			chartFrame.setSize(800, 500);
		} catch (Exception ex) {
			System.out.println(ex);

		}

	}
}