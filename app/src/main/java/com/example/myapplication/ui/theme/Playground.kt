package com.example.myapplication.ui.theme

import java.util.PriorityQueue

fun main() {
//    val a=15
//    val b=10
//    val c=70
//    val maxAb=a.takeIf{it>b}?:b
//      println(maxAb)
//     val maxx=maxAb.takeIf{it>c}?:c
//     print(maxx)
    println(largestElements(listOf(5,8,33,0,9),2))
}

private fun largestElements(list: List<Int>, count: Int): List<Int> {
//    if (list.size <= count) {
//        return list
//    }
//
//    val priorityQueue = PriorityQueue<Int>()
//
//    repeat(count) {
//        priorityQueue.add(list[it])
//        println(priorityQueue)
//    }
//    println("Peak "+priorityQueue.peek())
//    list
//        .drop(count)
//        .forEach {
//            if (it > priorityQueue.peek()) {
//                priorityQueue.poll()
//                priorityQueue.add(it)
//                println(priorityQueue)
//            }
//        }
//
//
//    return priorityQueue.toList()

    if(list.size<=count)
        return list

    val pq=PriorityQueue<Int>()

    repeat(count){
        pq.add(list[it])
        println(pq)
    }

    list
        .drop(count)
        .forEach{
            if(it>pq.peek()){
                pq.poll()
                pq.add(it)
            }
        }

    return pq.toList()
}