package aed.individual6;


import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.set.*;

import java.util.Iterator;

import es.upm.aedlib.graph.*;



public class Utils {
	
	
	
	
	static <V> void verticesdeV(DirectedGraph<V,Boolean> g, Vertex<V>v1,HashTableMapSet<Vertex<V>> vv1){
		Iterable<Edge<Boolean>> aux = g.outgoingEdges(v1);
		Iterator<Edge<Boolean>> it = aux.iterator();
		
		vv1.add(v1);
		
		while(it.hasNext()) {
			Edge<Boolean> x = it.next();
			if(x.element() == true) {
				if(!vv1.contains(g.endVertex(x))) {
					vv1.add(g.endVertex(x));
					verticesdeV(g,g.endVertex(x),vv1);
					}
			}
		}
	}
	
  /**
   * Devuelve un conjunto con todos los vertices alcanzables desde AMBOS
   * v1 y v2.
   */
  public static <V> Set<Vertex<V>> 
  reachableFromBoth(DirectedGraph<V,Boolean> g, Vertex<V> v1, Vertex<V> v2) {
	  Set<Vertex<V>> res = new HashTableMapSet<>();
	  
	  HashTableMapSet<Vertex<V>> vv1 = new HashTableMapSet<>();
	  HashTableMapSet<Vertex<V>> vv2 = new HashTableMapSet<>();
	  	  
	  verticesdeV(g,v1,vv1);
	  verticesdeV(g,v2,vv2);
	  
	  
	  Iterator <Vertex<V>> it = g.vertices().iterator();
	  
	  while(it.hasNext()) {
		  Vertex<V> x = it.next();
		  if(vv1.contains(x) && vv2.contains(x))
			  res.add(x);
		  }
    return res;
  }


  /**
   * Devuelve un camino (una lista de aristas) que llevan desde from y to,
   * donde la suma de los elementos de las aristas del camino <= limit.
   * Si no existe ningun camino que cumple con esta restriccion se devuelve
   * el valor null. 
   */
  
  public static <V> PositionList<Edge<Integer>> existsPathLess(UndirectedGraph<V,Integer> g, Vertex<V> from, Vertex<V> to, int limit) {
	  PositionList<Edge<Integer>> res = new NodePositionList<>();
	  Set<Vertex<V>> visited = new HashTableMapSet<>();
	  
	  if (!existsPathLessaux(g, from, to, limit, res, visited)) {
          return null;
      }
	  return res;
}
  
  
  
  private static <V> boolean existsPathLessaux(UndirectedGraph<V, Integer> g,Vertex<V> from,Vertex<V> to,
		int limit,PositionList<Edge<Integer>> res, Set<Vertex<V>> visited) {
	
	if (from == to) 
		return true;
	
	visited.add(from);
	
	for (Edge<Integer> edge : g.edges(from)) {
		if (!visited.contains(g.opposite(from, edge)) && edge.element()< limit) {
			res.addLast(edge);
			if(existsPathLessaux(g, g.opposite(from, edge), to, limit - edge.element(), res, visited))
				return true;
			res.remove(res.last());
			}
	}
	
	return false;
}












} 