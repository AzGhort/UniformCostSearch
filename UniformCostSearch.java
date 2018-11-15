import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class UniformCostSearch 
{
	public static<S> Node<S> Search(Problem<S> problem)
	{
		PriorityQueue<Node<S>> frontier = new PriorityQueue<Node<S>>();
		Set<S> exploredStates = new HashSet<S>();
		//HashMap<S, Node<S>> statesToFrontierNodes = new HashMap<S, Node<S>>();
		
		// root node of state tree
		Node<S> root = new Node<S>(null, problem.initialState(), -1, problem);
		frontier.add(root);
		
		Node<S> solution = null;
		// uniform cost search
		while (!frontier.isEmpty())
		{
			Node<S> top = frontier.poll();
			// we have already explored this state
			if (exploredStates.contains(top.state))
			{
				continue;
			}
			exploredStates.add(top.state);
			// top state is our goal!
			if (problem.isGoal(top.state))
			{
				solution = top;
				break;
			}
			List<Node<S>> children = top.getAllChildrenNodes();
			for (Node<S> child : children)
			{
				frontier.offer(child);
			}
		}
		
		// return the node, we can reconstruct the path from it
		return solution;
	}
}
