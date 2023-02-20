import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Storage implements CreateDelete {
	public ArrayList<Group> AllGroups;
	/**
	 * file name
	 */
	public static final String groupFileName = "groups.txt";

	public Storage() {
	}

	/**
	 * load groups from file
	 * ObjectInputStream is magic
	 * loading/saving in 3 lines of code
	 *
	 * @return status code
	 */
	public int loadGroups(JFrame main) {
		ArrayList<Group> AllGroups;
		try {
			boolean openSaved = false;
			int statusCode = 0;
			// Check if the saved file exist
			File file = new File(groupFileName);
			if (file.exists()) {
				int answer = JOptionPane.showConfirmDialog(main, "Чи бажаєте відновити останнє збереження?");
				if (answer == JOptionPane.OK_CANCEL_OPTION || answer == JOptionPane.CLOSED_OPTION) return -1;
				if (answer == JOptionPane.OK_OPTION) {
					openSaved = true;
					statusCode = 1;
				}
			}
			if (openSaved) {
				ObjectInputStream oos = new ObjectInputStream(new FileInputStream(groupFileName));
				AllGroups = (ArrayList<Group>) oos.readObject();
				oos.close();
			} else {
				AllGroups = new ArrayList<>();
				saveGroups();
			}

			this.AllGroups = AllGroups;
			return statusCode;
		} catch (Exception e) {
			System.out.println("Something is wrong with load");
			return -1;
		}
	}

	/**
	 * save all information
	 */
	public void saveGroups() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(groupFileName));
			oos.writeObject(AllGroups);
			oos.close();
		} catch (Exception e) {
			System.out.println("Something is wrong with save");
		}
	}

	@Override
	public void add(Object group) {
		AllGroups.add((Group) group);
	}

	@Override
	public void remove(int index) {
		AllGroups.remove(index);
	}
}
