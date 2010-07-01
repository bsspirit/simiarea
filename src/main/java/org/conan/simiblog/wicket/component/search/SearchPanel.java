package org.conan.simiblog.wicket.component.search;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.conan.simiblog.common.wicket.BasePanel;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public class SearchPanel extends BasePanel {

    private static final long serialVersionUID = 3467934059027145143L;

    private SearchForm searchForm = new SearchForm();

    public SearchPanel(String id) {
        super(id);

        Form<SearchForm> search = new SearchHtmlForm("search.form", searchForm);
        add(search);

        search.add(new Button("search.submit") {
            private static final long serialVersionUID = -5164387587767135614L;

            @Override
            public void onSubmit() {
                System.out.println("log==>"+log);
                log.info("searchForm==>"+ searchForm);
                log.info("search word:" + searchForm.getWord());
            }
        });
    }

}
