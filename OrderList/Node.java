package com.bridgelabz.model;

/*

* created by: Bridge Labz
* Date 09/05/2016
*
* Perpose: model class for Node

**/

public class Node<E>{

	//data veriable is used to store the data
	private E data;

	//Right is pointing to the next veriable in the link list
	public Node right;

	//left is pointing to the previous veriable in the link list
	public Node left;

	public Node(E data){
		this.data=data;
		right=null;
		left=null;
	}

	public Node(E data,Node right,Node left){
		this.data=data;
		this.right=right;
		this.left=left;
	}

	public void setData(E data){
		this.data=data;
	}

	public E getData(){
		return data;
	}

}
