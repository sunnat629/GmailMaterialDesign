package dos.sunnat629.com.gmailmaterialdesign.ui.adapters

import android.content.Context
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dos.sunnat629.com.gmailmaterialdesign.R
import dos.sunnat629.com.gmailmaterialdesign.model.entities.MailContent
import dos.sunnat629.com.gmailmaterialdesign.utils.Calculate
import kotlinx.android.synthetic.main.mail_list_item.view.*


class MailListAdapter() : RecyclerView.Adapter<MailListAdapter.ViewHolder>() {

    private lateinit var mContext: Context
    private var mMailContent: MutableList<MailContent> = mutableListOf()

    constructor(mContext: Context, mMailContent: Array<MailContent>):this(){
        this.mContext = mContext
        this.mMailContent = mMailContent.toMutableList()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return ViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.mail_list_item, parent, false))
    }

    internal fun setMeters(mMailContent: List<MailContent>) {
        this.mMailContent = mMailContent.toMutableList()
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int = mMailContent.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(position)


    inner class ViewHolder(private val mView: View) : RecyclerView.ViewHolder(mView) {
        fun bind(position: Int) {
            val item = mMailContent[position]
            mView.mailHolderText.text = item.receiver.subSequence(0, 1)
            mView.mailHolderText.setBackgroundColor(Calculate.getRandomMaterialColor())

            mView.sender.text = item.receiver
            mView.sender.setTypeface(null, isRead(item.isRead))

            mView.sub.text = item.mailSubject
            mView.sub.setTypeface(null, isRead(item.isRead))
            mView.lastMsg.text = item.lastMainContent

            mView.date.text = item.latestMailingTime
            mView.date.setTypeface(null, isRead(item.isRead))

            Glide.with(mContext).load(getImportantIcon(item.isImportant)).into(mView.important)
            Glide.with(mContext).load(getStarIcon(item.isStared)).into(mView.star)
        }

    }

    private fun isRead(isRead: Boolean): Int {
        return if (isRead) Typeface.BOLD
        else Typeface.NORMAL
    }

    private fun getImportantIcon(isImportant: Boolean): Drawable? {
        return if (isImportant) {
            mContext.resources.getDrawable(dos.sunnat629.com.gmailmaterialdesign.R.drawable.ic_label_important_24dp, null)
        } else {
            mContext.resources.getDrawable(dos.sunnat629.com.gmailmaterialdesign.R.drawable.ic_label_outline_important_24dp, null)
        }
    }

    private fun getStarIcon(isStar: Boolean): Drawable? {
        return if (isStar) {
            mContext.resources.getDrawable(dos.sunnat629.com.gmailmaterialdesign.R.drawable.ic_star_full_24dp, null)
        } else {
            mContext.resources.getDrawable(dos.sunnat629.com.gmailmaterialdesign.R.drawable.ic_star_24dp, null)
        }
    }
}