package com.myproject.smartmart.service;

import com.myproject.smartmart.dto.ProductDTO;

public class ProductServiceImpl implements ProductService {

    @Override
    public boolean save(ProductDTO dto) {

        if (dto == null) {
            System.out.println(" ProductDTO is null");
            return false;
        }

        boolean valid = true;

        /* ---------- NAME ---------- */
        if (isEmpty(dto.getName())) {
            System.out.println("Name is mandatory");
            valid = false;
        } else {
            if (dto.getName().length() < 3 || dto.getName().length() > 20) {
                System.out.println("Name must be 3-20 characters");
                valid = false;
            } else {
                System.out.println("Name OK");
            }
        }

        /* ---------- TYPE ---------- */
        if (isEmpty(dto.getType())) {
            System.out.println("Product type is mandatory");
            valid = false;
        } else {
            System.out.println("Type OK");
        }

        /* ---------- INCOMING PRICE ---------- */
        if (isEmpty(dto.getIncomingPrice())) {
            System.out.println(" Incoming price is mandatory");
            valid = false;
        } else {
            if (!isNumberBetween(dto.getIncomingPrice())) {
                System.out.println(" Incoming price must be > 1 and < 100");
                valid = false;
            } else {
                System.out.println(" Incoming price OK");
            }
        }

        /* ---------- SELLING PRICE ---------- */
        if (isEmpty(dto.getSellingPrice())) {
            System.out.println("Selling price is mandatory");
            valid = false;
        } else {
            if (!isNumberBetween(dto.getSellingPrice())) {
                System.out.println(" Selling price must be > 1 and < 100");
                valid = false;
            } else {
                System.out.println("Selling price OK");
            }
        }

        /* ---------- MRP ---------- */
        if (isEmpty(dto.getMrp())) {
            System.out.println(" MRP is mandatory");
            valid = false;
        } else {
            if (!isNumberBetween(dto.getMrp())) {
                System.out.println("MRP must be > 1 and < 100");
                valid = false;
            } else {
                System.out.println("MRP OK");
            }
        }

        /* ---------- DESCRIPTION ---------- */
        if (isEmpty(dto.getDescription())) {
            System.out.println("Description is mandatory");
            valid = false;
        } else {
            System.out.println("Description OK");
        }

        /* ---------- BRAND ---------- */
        if (isEmpty(dto.getBrand())) {
            System.out.println("Brand is mandatory");
            valid = false;
        } else {
            if (dto.getBrand().length() < 3 || dto.getBrand().length() > 20) {
                System.out.println("Brand must be 3-20 characters");
                valid = false;
            } else {
                System.out.println("Brand OK");
            }
        }

        /* ---------- QUANTITY ---------- */
        if (isEmpty(dto.getQuantity())) {
            System.out.println("Quantity is mandatory");
            valid = false;
        } else {
            if (!isIntegerBetween(dto.getQuantity())) {
                System.out.println("Quantity must be > 1 and < 100");
                valid = false;
            } else {
                System.out.println("Quantity OK");
            }
        }

        /* ---------- COLOR ---------- */
        if (isEmpty(dto.getColor())) {
            System.out.println("Color is mandatory");
            valid = false;
        } else {
            if (dto.getColor().length() < 3 || dto.getColor().length() > 20) {
                System.out.println("Color must be 3-20 characters");
                valid = false;
            } else {
                System.out.println("Color OK");
            }
        }

        /* ---------- MANUFACTURE DATE ---------- */
        if (isEmpty(dto.getManufDate())) {
            System.out.println("Manufacture date is mandatory");
            valid = false;
        } else {
            System.out.println("Manufacture date OK");
        }

        /* ---------- WARRANTY ---------- */
        if (isEmpty(dto.getWarranty())) {
            System.out.println("Warranty is mandatory");
            valid = false;
        } else {
            System.out.println("Warranty OK");
        }

        /* ---------- FINAL RESULT ---------- */
        if (valid) {
            System.out.println("🎉 All validations passed — product can be saved");
        } else {
            System.out.println("Validation failed — product NOT saved");
        }

        return valid;
    }

    /* ===== Helper methods ===== */

    private boolean isEmpty(String v) {
        return v == null || v.trim().isEmpty();
    }

    private boolean isNumberBetween(String v) {
        try {
            double n = Double.parseDouble(v);
            return n > 1 && n < 100;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isIntegerBetween(String v) {
        try {
            int n = Integer.parseInt(v);
            return n > 1 && n < 100;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
