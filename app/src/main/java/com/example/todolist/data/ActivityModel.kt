package com.example.todolist.data

data class ActivityModel (
    var image:Int=1,
    var activityName:String="",
    var activityTime:String="",
    var description:String="",
    var activityStatus: ActivityStatus = ActivityStatus.pending

    )