import javafx.scene.control.CheckBox;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
public class ToppingsBox extends VBox {
	// The following constants are used to indicate
			// the cost of each type of topping.
			public final double CREAM_CHEESE = 0.50;
			public final double BUTTER = 0.25;
			public final double PEACH_JELLY = 0.75;
			public final double BLUEBERRY_JAM = 0.75;

			// The following variables will reference CheckBox
			// buttons for Cream Cheese Butter Peach Jelly and Blueberry Jame .
			private CheckBox chkCreamCheese;
			private CheckBox chkButter;
			private CheckBox chkPeachJelly;
			private CheckBox chkBlueberryJam;
			

			/**
			 *  Constructor
			 */
			public ToppingsBox()  {

				// Create the check boxes.
				chkCreamCheese = new CheckBox("Cream Cheese");
				chkButter = new CheckBox("Butter");
				chkPeachJelly = new CheckBox("Peach Jelly");
				chkBlueberryJam = new CheckBox("Blueberry Jam");

				// Make another VBox to hold the check boxes.
				VBox vbox = new VBox(10);  // with 10 pixel spacing
				vbox.setStyle("-fx-background-color: BlanchedAlmond;");
				this.setStyle("-fx-background-color: BlanchedAlmond;");  // so outer VBox same color
				vbox.getChildren().add(chkCreamCheese);
				vbox.getChildren().add(chkButter);
				vbox.getChildren().add(chkPeachJelly);
				vbox.getChildren().add(chkBlueberryJam);

				// Make a TitledPane to hold the VBox of radio buttons
				TitledPane tp = new TitledPane("Toppings", vbox);
				tp.setCollapsible(false);
				this.getChildren().add(tp); // add the titled pane to this VBox
			}

			/**
			 *  The getToppingCost method returns the cost of
			 *  the selected topping.
			 */
			public double getToppingCost()
			{
				// The following variable will hold the cost
				// of the selected topping.
				double toppingCost = 0.0;

				// Determine which topping is selected.
				if (chkCreamCheese.isSelected())
					toppingCost += CREAM_CHEESE;
				if (chkButter.isSelected())
					toppingCost += BUTTER;
				if (chkPeachJelly.isSelected())
					toppingCost += PEACH_JELLY;
				if (chkBlueberryJam.isSelected())
					toppingCost += BLUEBERRY_JAM;
				
				// Return the cost of the selected topping.
				return toppingCost;
			}
}
