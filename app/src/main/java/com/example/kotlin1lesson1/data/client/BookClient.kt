package com.example.kotlin1lesson1.data.client

import com.example.kotlin1lesson1.R
import com.example.kotlin1lesson1.models.BookModel

class BookClient {  fun getBooks(): List<BookModel> {
    val list =  ArrayList<BookModel>()
    list.add(
        BookModel(
            "карамазовы",
            "«Бра́тья Карама́зовы» — последний роман Ф. М. Достоевского, который автор писал два года. Роман был напечатан частями в журнале «Русский вестник». Достоевский задумывал роман как первую часть эпического романа «История Великого грешника». Произведение было окончено в ноябре 1880 года. Писатель умер через два месяца после публикации.",
            R.drawable.books1
        )
    )
    list.add(
        BookModel(
            "Капитанская дочка ",
            "«Капита́нская до́чка» — исторический роман[K 1] (или повесть) Александра Пушкина, действие которого происходит во время восстания Емельяна Пугачёва. Впервые опубликован без указания имени автора в 4-й книжке журнала «Современник», поступившей в продажу в последней декаде 1836 года",
            R.drawable.books2
        )
    )
    list.add(
        BookModel(
            "мертвые души ",
                    "«Мёртвые ду́ши» (рус. дореф. Мертвыя души) — произведение Николая Васильевича Гоголя, жанр которого сам автор обозначил как поэма. Изначально задумано как трёхтомник. Первый том был издан в 1842 году. Практически готовый второй том был утерян, но сохранилось несколько глав в черновиках. Третий том не был начат, о нём остались только отдельные сведения.",
            R.drawable.books3
        )
    )
    list.add(
        BookModel(
            "Вий",
            "«Вий» — мистическая повесть Н. В. Гоголя, впервые опубликованная в его сборнике «Миргород» (1835). Название повести — это имя славянского демонического существа мужского пола, с которым связан сюжет.",
            R.drawable.books4
        )
    )


    return list
}
}