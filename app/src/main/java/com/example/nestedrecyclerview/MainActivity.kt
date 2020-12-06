package com.example.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.adapter.MainRecyclerAdapter
import com.example.nestedrecyclerview.model.AllCategory
import com.example.nestedrecyclerview.model.CategoryItem

class MainActivity : AppCompatActivity() {

    private var mainCategoryRecycler:RecyclerView? = null
    private var mainRecyclerAdapter:MainRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //add some data to out model class

        //1st category
        val categoryItemList: MutableList<CategoryItem> = ArrayList()
        categoryItemList.add(CategoryItem(1,R.drawable.hollywood1))
        categoryItemList.add(CategoryItem(1,R.drawable.hollywood2))
        categoryItemList.add(CategoryItem(1,R.drawable.hollywood3))
        categoryItemList.add(CategoryItem(1,R.drawable.hollywood4))
        categoryItemList.add(CategoryItem(1,R.drawable.hollywood5))
        categoryItemList.add(CategoryItem(1,R.drawable.hollywood6))

        //2nd category
        val categoryItemList2: MutableList<CategoryItem> = ArrayList()
        categoryItemList2.add(CategoryItem(1,R.drawable.bestofoscar1))
        categoryItemList2.add(CategoryItem(1,R.drawable.bestofoscar2))
        categoryItemList2.add(CategoryItem(1,R.drawable.bestofoscar3))
        categoryItemList2.add(CategoryItem(1,R.drawable.bestofoscar4))
        categoryItemList2.add(CategoryItem(1,R.drawable.bestofoscar5))
        categoryItemList2.add(CategoryItem(1,R.drawable.bestofoscar6))

        //3rd category
        val categoryItemList3: MutableList<CategoryItem> = ArrayList()
        categoryItemList3.add(CategoryItem(1,R.drawable.moviedubbedinhindi1))
        categoryItemList3.add(CategoryItem(1,R.drawable.moviedubbedinhindi2))
        categoryItemList3.add(CategoryItem(1,R.drawable.moviedubbedinhindi3))
        categoryItemList3.add(CategoryItem(1,R.drawable.moviedubbedinhindi4))
        categoryItemList3.add(CategoryItem(1,R.drawable.moviedubbedinhindi5))
        categoryItemList3.add(CategoryItem(1,R.drawable.moviedubbedinhindi6))

        //4th category
        val categoryItemList4: MutableList<CategoryItem> = ArrayList()
        categoryItemList4.add(CategoryItem(1,R.drawable.hollywood1))
        categoryItemList4.add(CategoryItem(1,R.drawable.hollywood2))
        categoryItemList4.add(CategoryItem(1,R.drawable.hollywood3))
        categoryItemList4.add(CategoryItem(1,R.drawable.hollywood4))
        categoryItemList4.add(CategoryItem(1,R.drawable.hollywood5))
        categoryItemList4.add(CategoryItem(1,R.drawable.hollywood6))

        //5th category
        val categoryItemList5: MutableList<CategoryItem> = ArrayList()
        categoryItemList5.add(CategoryItem(1,R.drawable.bestofoscar1))
        categoryItemList5.add(CategoryItem(1,R.drawable.bestofoscar2))
        categoryItemList5.add(CategoryItem(1,R.drawable.bestofoscar3))
        categoryItemList5.add(CategoryItem(1,R.drawable.bestofoscar4))
        categoryItemList5.add(CategoryItem(1,R.drawable.bestofoscar5))
        categoryItemList5.add(CategoryItem(1,R.drawable.bestofoscar6))

        val allCategory: MutableList<AllCategory> = ArrayList()
        allCategory.add(AllCategory("HollyWood", categoryItemList))
        allCategory.add(AllCategory("Best of Oscars", categoryItemList2))
        allCategory.add(AllCategory("Movies Dubbed in Hindi", categoryItemList3))
        allCategory.add(AllCategory("Category 4th", categoryItemList4))
        allCategory.add(AllCategory("Category 5th", categoryItemList5))

        setMainCategoryRecycler(allCategory)

    }

    private fun setMainCategoryRecycler(allCategory: List<AllCategory>){

        mainCategoryRecycler = findViewById(R.id.main_recycler)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        mainCategoryRecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = MainRecyclerAdapter(this, allCategory)
        mainCategoryRecycler!!.adapter = mainRecyclerAdapter

    }
}