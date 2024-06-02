package com.example.myapplication.linklist

fun main(){
    var list= LinkListMid()
    list.addNode(1, list.head)
    list.addNode(2,list.head)
    list.addNode(3,list.head)

    println(list.head.toString())
    println(list.size(list.head))
    println("mide of the list " +list.midOfList(list.head).toString())


}

data class Node(var  data:Int,var next: Node?){
    override fun toString(): String {
        return ""+data
    }
}

class LinkListMid {
    var head: Node?=null

    fun addNode(data:Int,head: Node?){
        var node= Node(data,head)
        node.next=head
        this.head=node
    }

    fun size(head: Node?):Int{
        var headNode=head
        var counter=0
        while(headNode!=null){
            headNode=headNode.next
            counter++
        }
        return counter
    }

    fun midOfList(head: Node?): Node? {
        var size=size(head)/2
        var counter=0
        var mid: Node? =head
        while (!(size==counter)){
            mid=head?.next
            counter++
        }
            return  mid
    }

}