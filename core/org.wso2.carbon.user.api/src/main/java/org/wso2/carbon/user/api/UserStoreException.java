/*                                                                             
 * Copyright 2004,2005 The Apache Software Foundation.                         
 *                                                                             
 * Licensed under the Apache License, Version 2.0 (the "License");             
 * you may not use this file except in compliance with the License.            
 * You may obtain a copy of the License at                                     
 *                                                                             
 *      http://www.apache.org/licenses/LICENSE-2.0                             
 *                                                                             
 * Unless required by applicable law or agreed to in writing, software         
 * distributed under the License is distributed on an "AS IS" BASIS,           
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    
 * See the License for the specific language governing permissions and         
 * limitations under the License.                                              
 */
package org.wso2.carbon.user.api;

/**
 * The exception to throw when there is a problem with the realm.
 */
public class UserStoreException extends Exception {

    /**
     * Default serial
     */
    private static final long serialVersionUID = -6057036683816666265L;

    public UserStoreException() {
        super();
    }

    public UserStoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserStoreException(String message, boolean convertMessage) {
        super(message);
    }


    public UserStoreException(String message) {
        super(message);
    }

    public UserStoreException(Throwable cause) {
        super(cause);
    }
}
