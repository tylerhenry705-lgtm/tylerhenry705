import java.util.ArrayList;
import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * A dataset is a collection of statistics
 * @author myersjac
 * @version 1.0
 */
public class DataSet {
	final String FILE_NAME = "serialize.ser";
	/**  collection of statistics **/
	private ArrayList<Statistic> stats = new ArrayList<Statistic>(20);

	/**
	 * the full-argument constructor
	 * @param stats the ArrayList of Statistics
	 */
	public DataSet(ArrayList<Statistic> stats) {
		this.stats = stats;
	}
		
	/**
	 * the no-argument constructor which initializes the stats collection
	 */
	public DataSet() {
		this.stats = new ArrayList<Statistic>();
	}

	/**
	 * use addStatistic to add a stat to the stats collection
	 * @param  Statistic stat
	 */
	public void addStatistic(Statistic stat) {
		this.stats.add(stat);
	}

	/**
	 * the accessor method
	 * @return  stats
	 */
	public ArrayList<Statistic> getStats() {
		return stats;
	}

	/**
	 * standard mutator method
	 * @param stats the stats to set
	 */
	public void setStats(ArrayList<Statistic> stats) {
		this.stats = stats;
	}
	
	/**
	 * The Serialize method
	 * @param Statistic statistic
	 * @throws "Serialize file not found: " + FILE_NAME + " " + LocalTime.now()
	 */
	public void serializeStatistic(Statistic statistic) throws StatisticDataNotFoundException{
		try {
		FileOutputStream fileOut = new FileOutputStream(FILE_NAME);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(statistic);
		out.close();
		fileOut.close();
		System.out.printf("Serialized data for state %s is saved in %s\n",
		((StateStatistic) statistic).getState(), FILE_NAME);
		}
		catch (IOException i) {
		throw new StatisticDataNotFoundException("Serialize file not found: " + FILE_NAME + " " + LocalTime.now());
		}
		}
	/**
	 * The Deserialize method
	 * @throws "Nothing to deserialize."
	 */
		public void deserializeStatistic() throws StatisticDataNotFoundException{
		try {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME));
		StateStatistic stat = (StateStatistic) in.readObject();
		System.out.println("State: " +stat.getState() + " \tHorses: "+ stat.getNumHorses()
		+ " \tBurros: " + stat.getNumBurros());
		}
		catch (Exception e) {
		throw new StatisticDataNotFoundException("Nothing to deserialize.");
		}
		}

}
