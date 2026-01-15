
import java.util.List;

public abstract class Animal {
	/**
	* Make this animal act - that is: make it do
	* whatever it wants/needs to do.
	*/
	// The animals's age.
	protected int age;
	// Whether the animal is alive or not.
	protected boolean alive;
	// The animal's position
	protected Location location;
	// The field occupied
	protected Field field;
	 /**
     * Check whether the animal is alive or not.
     * @return True if the animal is still alive.
     */
    public boolean isAlive()
    {
        return alive;
    }

    /**
     * Return the animal's location.
     * @return The animal's location.
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Place the animal at the new location in the given field.
     * @param newLocation The animals's new location.
     */
    protected void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }
   
    public Animal(boolean randomAge, Field field, Location location)
    {
        age = 0;
        alive = true;
        this.field = field;
        setLocation(location);  
    }
	abstract public void act(List<Animal> newAnimals);
}
