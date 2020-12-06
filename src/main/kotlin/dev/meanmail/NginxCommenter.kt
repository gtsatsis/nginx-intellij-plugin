package dev.meanmail

import com.intellij.lang.Commenter

class NginxCommenter : Commenter {

    override fun getCommentedBlockCommentPrefix(): String? = null

    override fun getCommentedBlockCommentSuffix(): String? = null

    override fun getBlockCommentPrefix(): String? = null

    override fun getBlockCommentSuffix(): String? = null

    override fun getLineCommentPrefix(): String = "# "

}
