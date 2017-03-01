package com.scujcc.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by David on 17/2/26.
 */

@Service
@Scope("prototype")
public class DemoPrototypeService {
}
