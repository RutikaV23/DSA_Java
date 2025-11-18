package observableInterface;

public interface observable 
{
	void registered (observer o);
	void unregistered (observer o);
	void notifyToAll();
}

