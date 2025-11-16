package observableInterface;

public interface obserable 
{
	void registered (observer o);
	void unregistered (observer o);
	void notifyToAll();
}
