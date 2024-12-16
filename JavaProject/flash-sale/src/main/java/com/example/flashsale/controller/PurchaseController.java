package com.example.flashsale.controller;

import com.example.flashsale.exception.BusinessException;
import com.example.flashsale.model.ApiResponse;
import com.example.flashsale.model.ErrorCode;
import com.example.flashsale.model.PurchaseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.flashsale.service.PurchaseService;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    /**
     * 处理抢购商品请求
     * @param request 用户提交的抢购请求，包含用户ID、商品ID和购买数量
     * @return 包含处理结果的统一响应格式
     */
    @PostMapping("/flash-sale")
    public ResponseEntity<ApiResponse> purchaseItem(@RequestBody PurchaseRequest request) {
        try {
            // 调用业务层逻辑
            purchaseService.purchaseItem(request);
            // 使用泛型明确指定类型
            return ResponseEntity.ok(new ApiResponse(ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getMessage(), null));
        } catch (BusinessException e) {
            return ResponseEntity.badRequest().body(new ApiResponse(e.getErrorCode().getCode(), e.getErrorCode().getMessage(), null));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse(ErrorCode.UNKNOWN_ERROR.getCode(), ErrorCode.UNKNOWN_ERROR.getMessage(), null));
        }
    }
}