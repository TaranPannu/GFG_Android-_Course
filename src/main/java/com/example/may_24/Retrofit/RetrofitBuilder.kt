package com.example.may_24.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilder {
companion object {
    var retrofitServices: RetrofitServices? = null
    fun getInstance(): RetrofitServices
    {
        if(retrofitServices == null)
        {
            retrofitServices = Retrofit
                .Builder()
                .baseUrl("https://dummyjson.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitServices::class.java)
        }
        return retrofitServices!!
    }
}
}

/**Retrofit: This is the core class that drives the entire Retrofit library.
 * It's the starting point for configuring and building your network communication setup.

.Builder(): This method initiates the construction of a Retrofit object.
It returns a Retrofit.Builder instance, which allows you to configure various aspects of how Retrofit will work.

.baseUrl("https://dummyjson.com"): This is a crucial step! It specifies the base URL of your API endpoint.
All subsequent API calls you make through Retrofit will be relative to this base URL.
In this case, you're targeting the "https://dummyjson.com" API.

.addConverterFactory(GsonConverterFactory.create()): Retrofit doesn't inherently understand how to
convert raw network responses (which are often in JSON format) into Java objects that your app can use.
This line adds a converter factory that uses Gson (a popular JSON parsing library) to handle this conversion process.

.build(): This method finalizes the Retrofit configuration you've set up. It constructs an immutable
Retrofit instance based on the options you've provided (base URL, converter factory, etc.).

.create(RetrofitServices::class.java):  This is where the magic happens! You pass in a reference
to your RetrofitServices interface (which you've defined elsewhere). Retrofit analyzes this interface,
using the annotations you've added (@GET, @POST, etc.) to understand how to structure API calls.
It then dynamically generates an implementation of this interface that handles the actual network communication.
The result is an object you can use to make your API requests.*/