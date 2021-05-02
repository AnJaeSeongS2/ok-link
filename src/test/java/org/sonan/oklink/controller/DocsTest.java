package org.sonan.oklink.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.sonan.oklink.restdoc.ApiDocumentUtils.getDocumentRequest;
import static org.sonan.oklink.restdoc.ApiDocumentUtils.getDocumentResponse;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Jaeseong on 2021/05/02
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@RunWith(SpringRunner.class)
@WebMvcTest(Docs.class)
@AutoConfigureRestDocs(uriScheme = "https", uriHost = "sonan.test.com")
class DocsTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void docs() throws Exception {

        //when
        ResultActions result = this.mockMvc.perform(get("/docs"));

        //then
        result
            .andExpect(status().isOk())
            .andDo(document("docs", getDocumentRequest(), getDocumentResponse()))

            .andDo(print());
    }
}