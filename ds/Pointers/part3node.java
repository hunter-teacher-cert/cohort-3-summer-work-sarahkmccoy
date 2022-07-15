/*
Write a code fragment to:
Create a new Node variable set it to point to the node with the 10 in it.
Create a new Node variable and instantiate it to a new Node with a value of 30.
Write the code to insert this new Node between the 10 and the 15
*/
// /**p--+
//    |		
//    v											e
//   +-----+-----+        +-----+-----+    +-----+-----+     +-----+-----+ 
//   | 5   |     |------->| 10  |     |--->| 15  |     |---->| 20  |     | 
//   |     |     |        |     |     |    |     |     |     |     |     | 
//   +-----+-----+        +-----+-----+    +-----+-----+     +-----+-----+ 

// +-----+-----+    <---f
//  30
// +-----+-----+   

Node e = p.getNext() // sets a new node e to the next node after p, the one with 10 in it
Node f = new Node (30); // creates new node variable = 30, which is floating around
f.setNext(e.getNext());  //sets the box after e (with 15) to be the box after f--puts the 15 in after f, but we still need to put the 30 after the 10
e.setNext(f); //sets the 30(f) after the 10 (e) "E says, set my next node to be f"

	/**using chaining: f.setNext(p.getNext().getNext())
    p.getNext().setNext(f) **/

