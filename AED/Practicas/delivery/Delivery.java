package aed.delivery;

import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.graph.DirectedAdjacencyListGraph;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.set.HashTableMapSet;
import es.upm.aedlib.set.Set;
import java.util.Iterator;

public class Delivery<V> {
	private DirectedGraph<V, Integer> g;
	
	public Delivery(V[] places, Integer[][] gmat) {
		  g = new DirectedAdjacencyListGraph<V, Integer>();
		  HashTableMap<Vertex<V>, PositionList<Vertex<V>>> mapa = new HashTableMap<>();
		  for (V place : places) {
		    Vertex<V> vertex = g.insertVertex(place);
		    mapa.put(vertex, new NodePositionList<>());
		  }

		  int len = places.length;
		  for (int i = 0; i < len; i++) {
		    for (int j = 0; j < len; j++) {
		    	if (i != j && gmat[i][j] != null && gmat[i][j] >= 0) {
		    	    Vertex<V> v1 = null;
		    	    Vertex<V> v2 = null;
		    	    for (Vertex<V> vertex : mapa.keys()) {
		    	        if (vertex.element().equals(places[i])) {
		    	            v1 = vertex;
		    	        } else if (vertex.element().equals(places[j])) {
		    	            v2 = vertex;
		    	        }
		    	    }
		    	    g.insertDirectedEdge(v1, v2, gmat[i][j]);
		    	}
		    }
		  }
		}
 
  public DirectedGraph<V, Integer> getGraph() {
    return g;
  }

  // Return a Hamiltonian path for the stored graph, or null if there is none.
  // The list containts a series of vertices, with no repetitions (even if the path
  // can be expanded to a cycle).
  public PositionList <Vertex<V>> tour() {	  
	  PositionList<Vertex<V>> res = new NodePositionList<>();
	  Set<Vertex<V>> visitados = new HashTableMapSet<>();
	  
	  Iterable<Vertex<V>> vertices = g.vertices();
	  Iterator<Vertex<V>> it = vertices.iterator();
	  boolean encontrado = false;

	    while(it.hasNext() && !encontrado) {
	        Vertex<V> aux = it.next();
	        res.addLast(aux);
	        visitados.add(aux);
	        encontrado = tourAux(res, visitados, aux);
	        if (!encontrado) {
	            res.remove(res.last());
	            visitados.remove(aux);
	        }
	    }

	    if (res.isEmpty()) 
	        return null;
	    

	    return res;
	}
  
  
  private boolean tourAux(PositionList<Vertex<V>> res, Set<Vertex<V>> visitados, Vertex<V> from) {
      if (visitados.size() == g.numVertices()) 
          return true;
      
      for (Edge<Integer> edge : g.outgoingEdges(from)) {
          Vertex<V> aux= g.endVertex(edge);
          if (!visitados.contains(aux)) {
              res.addLast(aux);
              visitados.add(aux);
              
              
              if(tourAux(res, visitados, aux)) 
                  return true;
              res.remove(res.last());
              visitados.remove(aux);
              
          }   
      }
      return false;
  }
	  
	  
	  

  
//Return the length of a path in the graph.
//The path has to have at least one node.
  public int length(PositionList<Vertex<V>> path) {
	    if (path.isEmpty()) {
	        return 0; 
	    }

	    int length = 0;
	    Iterator<Vertex<V>> iterator = path.iterator();
	    Vertex<V> it = iterator.next();

	    while (iterator.hasNext()) {
	        Vertex<V> it1 = iterator.next();
	        Edge<Integer> edge = Buscaredge(it, it1);
	        if (edge != null) {
	            length += edge.element();
	        } else {
	            return 0; 
	        }
	        it = it1;
	    }

	    return length;
	}

	private Edge<Integer> Buscaredge (Vertex<V> v1, Vertex<V> v2) {
	    for (Edge<Integer> edge : g.outgoingEdges(v1)) {
	        if (g.endVertex(edge).equals(v2)) {
	            return edge;
	        }
	    }
	    return null;
	}


  public String toString() {
    return "Delivery";
  }
}