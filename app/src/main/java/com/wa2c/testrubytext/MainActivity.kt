package com.wa2c.testrubytext

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.TextPaint
import android.view.Gravity
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.github.mljli.rubyspan.RubySpan

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val base = findViewById<ViewGroup>(R.id.main_layout)

        // FuriganaTextView ( lofe90 / FuriganaTextView )
        // https://github.com/lofe90/FuriganaTextView

        base.addView(TextView(this).also {
            it.text = "se.fekete.furiganatextview.furiganaview.FuriganaTextView"
            it.setTextColor(Color.BLUE)
        })

        se.fekete.furiganatextview.furiganaview.FuriganaTextView(this).also {
            it.setFuriganaText("<ruby>Android<rt>アンドロイド</rt></ruby>は、<ruby>Google<rt>グーグル</rt></ruby>が<ruby>開発<rt>かいはつ</rt></ruby>した<ruby>携帯汎用<rt>けいたいはんよう</rt></ruby>オペレーティングシステムである。", true)
            base.addView(it)
        }

        se.fekete.furiganatextview.furiganaview.FuriganaTextView(this).also {
            it.setFuriganaText("<ruby>あいうえお<rt>あいうえお</rt></ruby><ruby>ABCDEFG<rt>ABCDEFG</rt></ruby><ruby>１２<rt>１２３４５６７８</rt></ruby><ruby>12<rt>12345678</rt></ruby>",true)
            base.addView(it)
        }

        se.fekete.furiganatextview.furiganaview.FuriganaTextView(this).also {
            it.setFuriganaText("<ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby><ruby>あ<rt>あいうえお</rt></ruby>",true)
            base.addView(it)
        }

        // FuriganaView ( guentoan / FuriganaView )
        // https://github.com/guentoan/FuriganaView

        base.addView(TextView(this).also {
            it.text = "com.akira.nguyen.furigana.widget.FuriganaView"
            it.setTextColor(Color.BLUE)
        })

        com.akira.nguyen.furigana.widget.FuriganaView(this).also {
            it.setJText("{Android;アンドロイド}は、{Google;グーグル}が{開発;かいはつ}した{携帯汎用;けいたいはんよう}オペレーティングシステムである。")
            base.addView(it)
        }

        com.akira.nguyen.furigana.widget.FuriganaView(this).also {
            it.setJText("{あいえうお;あいうえお}{ABCDEFG;ABCDEFG}{１２;１２３４５６７８}{12;12345678}")
            base.addView(it)
        }

        com.akira.nguyen.furigana.widget.FuriganaView(this).also {
            it.setJText("{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}")
            base.addView(it)
        }

        // FuriganaView ( Vexu / Furigana-TextView )
        // https://github.com/Vexu/Furigana-TextView

        base.addView(TextView(this).also {
            it.text = "FuriganaView"
            it.setTextColor(Color.BLUE)
        })

        com.wa2c.testrubytext.FuriganaView(this).also {
            it.setText("{Android;アンドロイド}は、{Google;グーグル}が{開発;かいはつ}した{携帯汎用;けいたいはんよう}オペレーティングシステムである。")
            base.addView(it)
        }

        com.wa2c.testrubytext.FuriganaView(this).also {
            it.setText("{あいえうお;あいうえお}{ABCDEFG;ABCDEFG}{１２;１２３４５６７８}{12;12345678}")
            base.addView(it)
        }
        com.wa2c.testrubytext.FuriganaView(this).also {
            it.setText("{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}")
            base.addView(it)
        }

        // FuriganaView ( sh0 / furigana-view )
        // https://github.com/sh0/furigana-view

        base.addView(TextView(this).also {
            it.text = "ee.yutani.furiganaview.FuriganaView"
            it.setTextColor(Color.BLUE)
        })

        ee.yutani.furiganaview.FuriganaView(this).also {
            val tp = TextPaint()
            tp.textSize = 36f
            val text = "{Android;アンドロイド}は、{Google;グーグル}が{開発;かいはつ}した{携帯汎用;けいたいはんよう}オペレーティングシステムである。"
            it.text_set(tp, text, 0, 0)
            base.addView(it)
        }

        ee.yutani.furiganaview.FuriganaView(this).also {
            val tp = TextPaint()
            tp.textSize = 36f
            val text = "{あいえうお;あいうえお}{ABCDEFG;ABCDEFG}{１２;１２３４５６７８}{12;12345678}"
            it.text_set(tp, text, 0, 7)
            base.addView(it)
        }

        ee.yutani.furiganaview.FuriganaView(this).also {
            val tp = TextPaint()
            tp.textSize = 36f
            val text = "{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}{あ;あいうえお}"
            it.text_set(tp, text, 0, 7)
            base.addView(it)
        }

        // RubyTextView ( b84330808 / RubyTextView )
        // https://github.com/b84330808/RubyTextView

        base.addView(TextView(this).also {
            it.text = "me.weilunli.views.RubyTextView"
            it.setTextColor(Color.BLUE)
        })

        me.weilunli.views.RubyTextView(this).also {
            it.combinedText = "Android|アンドロイド は、 Google|グーグル が 開発|かいはつ した 携帯汎用|けいたいはんよう オペレーティングシステムである。"
            base.addView(it)
        }

        me.weilunli.views.RubyTextView(this).also {
            it.combinedText = "あいえうお|あいうえお ABCDEFG|ABCDEFG １２|１２３４５６７８ 12|12345678"
            base.addView(it)
        }

        me.weilunli.views.RubyTextView(this).also {
            it.combinedText = "あ|あいうえお あ|あいうえお あ|あいうえお あ|あいうえお あ|あいうえお あ|あいうえお あ|あいうえお あ|あいうえお あ|あいうえお あ|あいうえお あ|あいうえお あ|あいうえお あ|あいうえお あ|あいうえお "
            base.addView(it)
        }

        // RubySpan ( mljli / rubyspan )
        // https://github.com/mljli/rubyspan

        base.addView(TextView(this).also {
            it.text = "io.github.mljli.rubyspan.RubySpan"
            it.setTextColor(Color.BLUE)
        })

        TextView(this).also {
            val ssb = SpannableStringBuilder("Androidは、Googleが開発した携帯汎用オペレーティングシステムである。")
            ssb.setSpan(RubySpan("アンドロイド"), 0, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("グーグル"), 9, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("かいはつ"), 16, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("けいたいはんよう"), 20, 24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            it.text = ssb
            it.height = 120
            it.gravity = Gravity.BOTTOM
            base.addView(it)
        }

        TextView(this).also {
            val ssb = SpannableStringBuilder("あいえうおABCDEFG１２12")
            ssb.setSpan(RubySpan("あいえうお"), 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("ABCDEFG"), 5, 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("１２３４５６７８"), 12, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            //ssb.setSpan(RubySpan("12345678"), 14, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            it.text = ssb
            it.height = 64
            it.gravity = Gravity.BOTTOM
            base.addView(it)
        }

        TextView(this).also {
            val ssb = SpannableStringBuilder("ああああああああああああああ")
            ssb.setSpan(RubySpan("あいえうお"), 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("あいえうお"), 1, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("あいえうお"), 2, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("あいえうお"), 3, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("あいえうお"), 4, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("あいえうお"), 5, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("あいえうお"), 6, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("あいえうお"), 7, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("あいえうお"), 8, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("あいえうお"), 9, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("あいえうお"), 10, 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("あいえうお"), 11, 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            ssb.setSpan(RubySpan("あいえうお"), 12, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            //=ssb.setSpan(RubySpan("あいえうお"), 13, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            it.text = ssb
            it.height = 200
            it.gravity = Gravity.CENTER_VERTICAL
            base.addView(it)
        }


    }
}
