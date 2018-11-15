import java.util.List;
import java.util.Vector;

// node of a problem
public class Node<S> implements Comparable<Node<S>>
{
	public S state;
	public Node<S> parent;  // parent node, or null if this is the start node
	public int action; 		// the action we took to get here from the parent
	public int pathCost;
	public Problem<S> problem;
	
	@Override
	public int compareTo(Node<S> o)
	{
		// the lower the path cost, the better!
		if (pathCost < pathCost) return 1;
		else if (pathCost == o.pathCost) return 0;
		else return -1;
	}

	public Node(Node<S> parent, S state, int action, Problem<S> problem)
	{
		this.state = state;
		this.parent = parent;
		this.action = action;
		this.problem = problem;
		this.pathCost = this.parent.pathCost + problem.cost(this.parent.state, action);
	}
	
	public List<Node<S>> getAllChildrenNodes()
	{
		List<Node<S>> children = new Vector<Node<S>>();
		List<Integer> possibleActions = problem.actions(state);
		for (Integer act: possibleActions)
		{
			Node<S> child = new Node<S>(this, problem.result(state, act), act, problem);
			children.add(child);
		}		
		return children;		
	}
}
