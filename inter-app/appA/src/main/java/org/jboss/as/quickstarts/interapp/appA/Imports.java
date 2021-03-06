/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.interapp.appA;

import javax.ejb.EJB;
import javax.enterprise.inject.Produces;

import org.jboss.as.quickstarts.interapp.shared.Bar;

/**
 * The Imports class is used to alias EJBs imported from other applications as local CDI beans, thus allowing consumers to
 * ignore the details of inter-application communication.
 * 
 * @author Pete Muir
 * 
 */
public class Imports {

    @SuppressWarnings("unused")
    @Produces
    @EJB(lookup = "java:global/jboss-inter-app-B/BarImpl!org.jboss.as.quickstarts.interapp.shared.Bar")
    private Bar bar;

    private Imports() {
        // Disable instantiation of this class
    }

}
