package com.struts;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.Arrangement;
@Controller("arrangementAction")
@Scope("prototype")
public class ArrangementAction extends BaseAction<Arrangement> {

}
