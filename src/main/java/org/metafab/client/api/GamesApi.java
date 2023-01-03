/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.4.1
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.metafab.client.api;

import org.metafab.client.ApiInvoker;
import org.metafab.client.ApiException;
import org.metafab.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.AuthGame200Response;
import org.openapitools.client.model.CreateGameRequest;
import org.openapitools.client.model.GameModel;
import org.openapitools.client.model.PublicGame;
import org.openapitools.client.model.UpdateGameRequest;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class GamesApi {
  String basePath = "https://api.trymetafab.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Authenticate game
  * Returns an existing game object containing authorization keys and credentials when provided a valid email (in place of username) and password login using Basic Auth.
   * @return AuthGame200Response
  */
  public AuthGame200Response authGame () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/v1/games/auth";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "basicAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (AuthGame200Response) ApiInvoker.deserialize(localVarResponse, "", AuthGame200Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Authenticate game
   * Returns an existing game object containing authorization keys and credentials when provided a valid email (in place of username) and password login using Basic Auth.

  */
  public void authGame (final Response.Listener<AuthGame200Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/v1/games/auth".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "basicAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((AuthGame200Response) ApiInvoker.deserialize(localVarResponse,  "", AuthGame200Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Create game
  * Create a new game. A game is the root entity required for all API interactions. Contracts, currencies, items and more are deployed by games, player accounts are created and registered to games, etc.  To use any of MetaFab&#39;s services, you must first create a game through this endpoint.  After creating your game through this endpoint, a verification email will be sent to the email address used. Before you can access any of MetaFab&#39;s features, you&#39;ll need to click the link contained in the verification email to verify your account.
   * @param createGameRequest 
   * @return AuthGame200Response
  */
  public AuthGame200Response createGame (CreateGameRequest createGameRequest) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = createGameRequest;
    // verify the required parameter 'createGameRequest' is set
    if (createGameRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createGameRequest' when calling createGame",
        new ApiException(400, "Missing the required parameter 'createGameRequest' when calling createGame"));
    }

    // create path and map variables
    String path = "/v1/games";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (AuthGame200Response) ApiInvoker.deserialize(localVarResponse, "", AuthGame200Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Create game
   * Create a new game. A game is the root entity required for all API interactions. Contracts, currencies, items and more are deployed by games, player accounts are created and registered to games, etc.  To use any of MetaFab&#39;s services, you must first create a game through this endpoint.  After creating your game through this endpoint, a verification email will be sent to the email address used. Before you can access any of MetaFab&#39;s features, you&#39;ll need to click the link contained in the verification email to verify your account.
   * @param createGameRequest 
  */
  public void createGame (CreateGameRequest createGameRequest, final Response.Listener<AuthGame200Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = createGameRequest;

    // verify the required parameter 'createGameRequest' is set
    if (createGameRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createGameRequest' when calling createGame",
        new ApiException(400, "Missing the required parameter 'createGameRequest' when calling createGame"));
    }

    // create path and map variables
    String path = "/v1/games".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((AuthGame200Response) ApiInvoker.deserialize(localVarResponse,  "", AuthGame200Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get game
  * Returns a game object for the provided game id.
   * @param gameId Any game id within the MetaFab ecosystem.
   * @return PublicGame
  */
  public PublicGame getGame (String gameId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'gameId' is set
    if (gameId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'gameId' when calling getGame",
        new ApiException(400, "Missing the required parameter 'gameId' when calling getGame"));
    }

    // create path and map variables
    String path = "/v1/games/{gameId}".replaceAll("\\{" + "gameId" + "\\}", apiInvoker.escapeString(gameId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (PublicGame) ApiInvoker.deserialize(localVarResponse, "", PublicGame.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get game
   * Returns a game object for the provided game id.
   * @param gameId Any game id within the MetaFab ecosystem.
  */
  public void getGame (String gameId, final Response.Listener<PublicGame> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'gameId' is set
    if (gameId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'gameId' when calling getGame",
        new ApiException(400, "Missing the required parameter 'gameId' when calling getGame"));
    }

    // create path and map variables
    String path = "/v1/games/{gameId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "gameId" + "\\}", apiInvoker.escapeString(gameId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((PublicGame) ApiInvoker.deserialize(localVarResponse,  "", PublicGame.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Update game
  * Update various fields specific to a game. Such as changing its password, resetting its published or secret key, or updating its RPCs.
   * @param gameId Any game id within the MetaFab ecosystem.
   * @param xAuthorization The &#x60;secretKey&#x60; of the authenticating game.
   * @param updateGameRequest 
   * @return GameModel
  */
  public GameModel updateGame (String gameId, String xAuthorization, UpdateGameRequest updateGameRequest) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = updateGameRequest;
    // verify the required parameter 'gameId' is set
    if (gameId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'gameId' when calling updateGame",
        new ApiException(400, "Missing the required parameter 'gameId' when calling updateGame"));
    }
    // verify the required parameter 'xAuthorization' is set
    if (xAuthorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xAuthorization' when calling updateGame",
        new ApiException(400, "Missing the required parameter 'xAuthorization' when calling updateGame"));
    }
    // verify the required parameter 'updateGameRequest' is set
    if (updateGameRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'updateGameRequest' when calling updateGame",
        new ApiException(400, "Missing the required parameter 'updateGameRequest' when calling updateGame"));
    }

    // create path and map variables
    String path = "/v1/games/{gameId}".replaceAll("\\{" + "gameId" + "\\}", apiInvoker.escapeString(gameId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("X-Authorization", ApiInvoker.parameterToString(xAuthorization));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (GameModel) ApiInvoker.deserialize(localVarResponse, "", GameModel.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Update game
   * Update various fields specific to a game. Such as changing its password, resetting its published or secret key, or updating its RPCs.
   * @param gameId Any game id within the MetaFab ecosystem.   * @param xAuthorization The &#x60;secretKey&#x60; of the authenticating game.   * @param updateGameRequest 
  */
  public void updateGame (String gameId, String xAuthorization, UpdateGameRequest updateGameRequest, final Response.Listener<GameModel> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = updateGameRequest;

    // verify the required parameter 'gameId' is set
    if (gameId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'gameId' when calling updateGame",
        new ApiException(400, "Missing the required parameter 'gameId' when calling updateGame"));
    }
    // verify the required parameter 'xAuthorization' is set
    if (xAuthorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xAuthorization' when calling updateGame",
        new ApiException(400, "Missing the required parameter 'xAuthorization' when calling updateGame"));
    }
    // verify the required parameter 'updateGameRequest' is set
    if (updateGameRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'updateGameRequest' when calling updateGame",
        new ApiException(400, "Missing the required parameter 'updateGameRequest' when calling updateGame"));
    }

    // create path and map variables
    String path = "/v1/games/{gameId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "gameId" + "\\}", apiInvoker.escapeString(gameId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("X-Authorization", ApiInvoker.parameterToString(xAuthorization));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((GameModel) ApiInvoker.deserialize(localVarResponse,  "", GameModel.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
