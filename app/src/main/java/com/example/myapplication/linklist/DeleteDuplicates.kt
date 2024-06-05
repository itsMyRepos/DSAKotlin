package com.example.myapplication.linklist

class ListNode1(var `val`: Int) {
    var next: ListNode1? = null
    override fun toString(): String {
        return if (next != null){
            "${`val`} -> ${next.toString()}"
        }else{
            "${`val`}"
        }
    }
}
class Duplicates  {
    var head1:ListNode1?=null
    fun addItems(data:Int,head:ListNode1?){
        var item=ListNode1(data)
        item.next=head
        head1=item
    }
}

class Solution1 {
    fun deleteDuplicates(head: ListNode1?): ListNode1? {

        if(head==null || head.next==null){
            return head
        }
        var map=mutableMapOf<Int,Int>()
        var traverser=head
        while(traverser!=null){
            println("Running")
            var key=traverser.`val`
            if(map.contains(key)){
                var get=map.getValue(key)
                map.put(key,get+1)
            }else{
                map.put(key,1)
            }
            traverser=traverser.next
        }

        traverser=null
        map.forEach{
                entries->
            if(entries.value<=1){
                var node=ListNode1(entries.key)
               node.next=traverser
                traverser=node
            }

        }
        println("This is Map="+map.entries)
        return traverser
    }

}

fun main(){
    var list1=Duplicates()
    list1.addItems(1,list1.head1)
    list1.addItems(2,list1.head1)
    list1.addItems(3,list1.head1)
    list1.addItems(3,list1.head1)
    list1.addItems(4,list1.head1)
    list1.addItems(4,list1.head1)
    list1.addItems(5,list1.head1)
    println("First list  "+list1.head1.toString())
    println("First list head "+list1.head1?.`val`)



    var sol=Solution1()
    println("Merged list "+sol.deleteDuplicates(list1.head1).toString())





}