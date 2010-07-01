package org.conan.simiblog.wicket.component.search;

import org.conan.simiblog.common.model.BaseDTO;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public class SearchForm extends BaseDTO {

    private static final long serialVersionUID = 2220156606204798451L;

    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
