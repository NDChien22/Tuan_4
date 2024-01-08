package com.example.myapplication.Tuan412

import android.content.Context
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import java.security.AccessControlContext

class VolleyKotlinFn {
    var strJson = ""
    fun getJsonArrayObjects(context: Context, textview: TextView){
        //tao request
        val queue = Volley.newRequestQueue(context)
        //2,url
        val url = "https://batdongsanabc.000webhostapp.com/thanglong/array_json_new.json"
        // 3.goi request
        //JsonArrayRequest(url,thanhcong,thatbai)
        val request = JsonArrayRequest(url,
            Response.Listener {
                              response ->
                              for (i in 0 until response.length()){
                                  //lay cac doi tuong
                                  val person = response.getJSONObject(i)
                                  val id = person.getString("id")
                                  val name = person.getString("name")
                                  val email = person.getString("email")
                                  //dua tat ca vao textview
                                  strJson += "id: $id\n"
                                  strJson += "name: $name\n"
                                  strJson += "email: $email\n"
                              }
                textview.text = strJson
            },
            Response.ErrorListener {
                error ->  textview.text = error.message
            })
        //4.thuc thi request
        queue.add(request)
    }
}