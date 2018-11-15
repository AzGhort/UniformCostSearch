import java.util.AbstractSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UniformCostSearch 
{
	public static <S> Node<S> Search(Problem<S> problem)
	{
		PriorityQueue<Node<S>> frontier = new PriorityQueue<Node<S>>();
		Set<S> exploredStates = new HashSet<S>();
		HashMap<S, Node<S>> statesToFrontierNodes = new HashMap<S, Node<S>>();
		// uniform cost search
		Node<S> root = new Node<S>(null, problem.initialState(), -1, problem);
		frontier.add(root);
		
		
		return null;
	}
}
