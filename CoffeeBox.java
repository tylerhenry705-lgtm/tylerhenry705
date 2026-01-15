import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
public class CoffeeBox extends VBox {
	// The following constants are used to indicate
		// the cost of each type of coffee.
	    public final double NONE = 0.00;
		public final double REGULAR_COFFEE = 1.25;
		public final double DECAF_COFEE = 1.25;
		public final double CAPPUCCINO = 2.00;

		// The following variables will reference radio
		// buttons for regular coffee decaf coffee and cappuccino .
		private RadioButton rdoNone;
		private RadioButton rdoRegular;
		private RadioButton rdoDecaf;
		private RadioButton rdoCappuccino;
		

		// The following variable will reference a
		// ToggleGroup object to group the radio buttons.
		private ToggleGroup tg;

		/**
		 *  Constructor
		 */
		public CoffeeBox()  {

			// Create group for the radio buttons.
			tg = new ToggleGroup();

			// Create the radio buttons.
			rdoNone = new RadioButton("None");
			rdoRegular = new RadioButton("Regular coffee");
			rdoDecaf = new RadioButton("Decaf coffee");
			rdoCappuccino = new RadioButton("Cappuccino coffee");

			rdoNone.setToggleGroup(tg);
			rdoRegular.setToggleGroup(tg);
			rdoDecaf.setToggleGroup(tg);
			rdoCappuccino.setToggleGroup(tg);
			rdoNone.setSelected(true);

			// Make another VBox to hold the radio buttons.
			VBox vbox = new VBox(10);  // with 10 pixel spacing
			vbox.setStyle("-fx-background-color: BlanchedAlmond;");
			this.setStyle("-fx-background-color: BlanchedAlmond;");  // so outer VBox same color
			vbox.getChildren().add(rdoNone);
			vbox.getChildren().add(rdoRegular);
			vbox.getChildren().add(rdoDecaf);
			vbox.getChildren().add(rdoCappuccino);

			// Make a TitledPane to hold the VBox of radio buttons
			TitledPane tp = new TitledPane("Coffee", vbox);
			tp.setCollapsible(false);
			this.getChildren().add(tp); // add the titled pane to this VBox
		}

		/**
		 *  The getCoffeeCost method returns the cost of
		 *  the selected coffee.
		 */
		public double getCoffeeCost()
		{
			// The following variable will hold the cost
			// of the selected coffee.
			double coffeeCost = 0.0;

			// Determine which coffee is selected.
			if (rdoRegular.isSelected())
				coffeeCost = REGULAR_COFFEE;
			else if (rdoCappuccino.isSelected())
				coffeeCost = CAPPUCCINO;
			else if (rdoDecaf.isSelected())
				coffeeCost = DECAF_COFEE;
			else
				coffeeCost = NONE;

			// Return the cost of the selected coffee.
			return coffeeCost;
		}
}
