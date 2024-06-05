package com.example.myapplication.linklist

class ListNode(var `val`: Int) {
       var next: ListNode? = null
    override fun toString(): String {
        return if (next != null){
            "${`val`} -> ${next.toString()}"
        }else{
            "${`val`}"
        }
    }
}
class MergeTwoList  {
    var head1:ListNode?=null
    fun addItems(data:Int,head:ListNode?){
        var item=ListNode(data)
        item.next=head
        head1=item
    }
}
class MergeTwoList2  {
    var head2:ListNode?=null
    fun addItems(data:Int,head:ListNode?){
        var item=ListNode(data)
        item.next=head
        head2=item
    }
}
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 != null && list2 != null) {
            if (list1.`val` < list2.`val`) {
                val listNode=mergeTwoLists(list1.next, list2)
                println("Method call if"+listNode?.`val`)
                list1.next = listNode
                return list1
            } else {
                val listNode=mergeTwoLists(list1, list2.next)
                println("Method call else"+listNode?.`val`)
                list2.next = listNode
                return list2
            }
        }

        if (list1 != null) {
            return list1
        }
        return list2
    }

}

fun main(){
    var list1=MergeTwoList()
    list1.addItems(4,list1.head1)
    list1.addItems(2,list1.head1)
    list1.addItems(1,list1.head1)
    println("First list  "+list1.head1.toString())
    println("First list head "+list1.head1?.`val`)

    var list2=MergeTwoList2()
    list2.addItems(4,list2.head2)
    list2.addItems(3,list2.head2)
    list2.addItems(1,list2.head2)
    println("secondList list head "+list2.head2.toString())

    var sol=Solution()
    println("Merged list "+sol.mergeTwoLists(list1.head1,list2.head2).toString())





}