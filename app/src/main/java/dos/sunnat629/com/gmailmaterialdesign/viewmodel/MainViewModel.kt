//package dos.sunnat629.com.gmailmaterialdesign.viewmodel
//
//import android.graphics.drawable.Drawable
//import androidx.databinding.ObservableField
//import androidx.databinding.ObservableInt
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import dos.sunnat629.com.gmailmaterialdesign.R
//import dos.sunnat629.com.gmailmaterialdesign.model.entities.MailContent
//import dos.sunnat629.com.gmailmaterialdesign.ui.MainActivity
//
//
//class MainViewModel(mainActivity: MainActivity) : ViewModel() {
//
//    private val mailContent: MailContent = MailContent()
//    val contentString = ObservableInt()
//
//    var mailContentList = MutableLiveData<List<MailContent>>()
//    var profileImage: ObservableField<Drawable> = ObservableField()
//
//    private val mainActivity: MainActivity = mainActivity
//
//    fun fetchMailContentList(mailContentList: MutableLiveData<List<MailContent>>){
//        this.mailContentList = mailContentList
//    }
//
//    fun getMailContentAt(position: Int): MailContent {
//        return mailContentList.value!![position]
//    }
//
//    fun getImportantImage(position: Int): Drawable {
//        return if(getMailContentAt(position).isImportant)mainActivity.resources.getDrawable(R.drawable.ic_label_important_24dp, null)
//        else mainActivity.resources.getDrawable(R.drawable.ic_label_outline_important_24dp, null)
//    }
//
//    fun getStaredImage(position: Int): Drawable {
//        return if(getMailContentAt(position).isStared)mainActivity.resources.getDrawable(R.drawable.ic_star_full_24dp, null)
//        else mainActivity.resources.getDrawable(R.drawable.ic_star_24dp, null)
//    }
//
//    fun getSenderChar(position: Int): String {
//        return mailContentList.value!![position].receiver.subSequence(0,1).toString()
//    }
//}