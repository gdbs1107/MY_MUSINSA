package com.example.musinsa_clone.test.service;

import com.example.musinsa_clone.test.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SizeService {

    private final ProductRepository productRepository;
    private final TopSizeRepository topSizeRepository;
    private final BottomSizeRepository bottomSizeRepository;
    private final ShoeSizeRepository shoeSizeRepository;

    @Autowired
    public SizeService(ProductRepository productRepository,
                       TopSizeRepository topSizeRepository,
                       BottomSizeRepository bottomSizeRepository,
                       ShoeSizeRepository shoeSizeRepository) {
        this.productRepository = productRepository;
        this.topSizeRepository = topSizeRepository;
        this.bottomSizeRepository = bottomSizeRepository;
        this.shoeSizeRepository = shoeSizeRepository;
    }

    @Transactional
    public Product addTopSize(Long productId, TopSizeRequest topSizeRequest) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product ID"));

        TopSize topSize = new TopSize();
        topSize.setChestSize(topSizeRequest.getChestSize());
        topSize.setSleeveLength(topSizeRequest.getSleeveLength());
        topSize.setProduct(product);

        topSizeRepository.save(topSize);
        return product;
    }

    @Transactional
    public Product addBottomSize(Long productId, BottomSizeRequest bottomSizeRequest) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product ID"));

        BottomSize bottomSize = new BottomSize();
        bottomSize.setWaistSize(bottomSizeRequest.getWaistSize());
        bottomSize.setInseamLength(bottomSizeRequest.getInseamLength());
        bottomSize.setProduct(product);

        bottomSizeRepository.save(bottomSize);
        return product;
    }

    @Transactional
    public Product addShoeSize(Long productId, ShoeSizeRequest shoeSizeRequest) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product ID"));

        ShoeSize shoeSize = new ShoeSize();
        shoeSize.setShoeSize(shoeSizeRequest.getShoeSize());
        shoeSize.setProduct(product);

        shoeSizeRepository.save(shoeSize);
        return product;
    }
}

